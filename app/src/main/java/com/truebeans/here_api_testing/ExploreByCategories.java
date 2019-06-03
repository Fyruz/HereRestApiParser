package com.truebeans.here_api_testing;

import com.google.gson.Gson;
import com.truebeans.here_api_testing.json.Discovery;
import com.truebeans.here_api_testing.json.Items;

import java.util.ArrayList;
import java.util.List;

public class ExploreByCategories extends InternetCaller {

    private List<HerePlace> foundPlaces;

    ExploreByCategories(){
        execute();
    }

    @Override
    public String getRequestUrl() {
        return "in=43.586686,11.315838;r=2000&tf=plain&cat=bar-pub&size=20&cs=places";
    }

    @Override
    public void responseReceived() {

        foundPlaces = new ArrayList<>();

        Gson gson = new Gson();
        Discovery discovery = gson.fromJson(serverResponse, Discovery.class);

        Items[] foundItems = discovery.getResults().getItems();

        for(Items item: foundItems)
            generateHerePlace(item);
    }

    @Override
    public void asyncBeforeInternetCall() {

    }

    private void generateHerePlace(Items item){
        HerePlace foundPlace = new HerePlace();
        foundPlace.setPlaceId(item.getId());
        foundPlace.setPlaceName(item.getTitle());
        foundPlace.setDistance(item.getDistance());
        foundPlace.setLatitude(Long.parseLong(item.getPosition()[0]));
        foundPlace.setLongitude(Long.parseLong(item.getPosition()[1]));
        foundPlace.setOpeningsHour(item.getOpeningHours().getText());
        foundPlace.setOpen(Boolean.parseBoolean(item.getOpeningHours().getIsOpen()));
        foundPlace.setVicinity(item.getVicinity());
        foundPlace.setViewUri(item.getHref());//TODO check if this is the real viewUri
        foundPlaces.add(foundPlace);
    }

}
