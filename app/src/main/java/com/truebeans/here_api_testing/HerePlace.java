package com.truebeans.here_api_testing;

public class HerePlace {

    private String placeName;
    private String placeId;
    private String openingsHour;
    private boolean isOpen;
    private String distance;
    private long latitude;
    private long longitude;
    private String vicinity;
    private String viewUri;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getOpeningsHour() {
        return openingsHour;
    }

    public void setOpeningsHour(String openingsHour) {
        this.openingsHour = openingsHour;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public String getViewUri() {
        return viewUri;
    }

    public void setViewUri(String viewUri) {
        this.viewUri = viewUri;
    }
}
