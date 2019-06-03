package com.truebeans.here_api_testing.json;

public class Items
{
    private String[] having;

    private String distance;

    private String averageRating;

    private String icon;

    private String vicinity;

    private OpeningHours openingHours;

    private String[] position;

    private Categories[] categories;

    private String href;

    private String id;

    private String title;

    private String type;

    public String[] getHaving ()
    {
        return having;
    }

    public void setHaving (String[] having)
    {
        this.having = having;
    }

    public String getDistance ()
    {
        return distance;
    }

    public void setDistance (String distance)
    {
        this.distance = distance;
    }

    public String getAverageRating ()
    {
        return averageRating;
    }

    public void setAverageRating (String averageRating)
    {
        this.averageRating = averageRating;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getVicinity ()
    {
        return vicinity;
    }

    public void setVicinity (String vicinity)
    {
        this.vicinity = vicinity;
    }

    public OpeningHours getOpeningHours ()
    {
        return openingHours;
    }

    public void setOpeningHours (OpeningHours openingHours)
    {
        this.openingHours = openingHours;
    }

    public String[] getPosition ()
    {
        return position;
    }

    public void setPosition (String[] position)
    {
        this.position = position;
    }

    public Categories[] getCategories ()
    {
        return categories;
    }

    public void setCategories (Categories[] categories)
    {
        this.categories = categories;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [having = "+having+", distance = "+distance+", averageRating = "+averageRating+", icon = "+icon+", vicinity = "+vicinity+", openingHours = "+openingHours+", position = "+position+", categories = "+categories+", href = "+href+", id = "+id+", title = "+title+", type = "+type+"]";
    }
}