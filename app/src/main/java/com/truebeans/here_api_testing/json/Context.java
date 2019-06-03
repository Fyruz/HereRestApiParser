package com.truebeans.here_api_testing.json;

public class Context
{
    private Location location;

    private String href;

    private String type;

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
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
        return "ClassPojo [location = "+location+", href = "+href+", type = "+type+"]";
    }
}