package com.truebeans.here_api_testing.json;

public class Categories
{
    private String system;

    private String icon;

    private String id;

    private String href;

    private String title;

    private String type;

    public String getSystem ()
    {
        return system;
    }

    public void setSystem (String system)
    {
        this.system = system;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
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
        return "ClassPojo [system = "+system+", icon = "+icon+", id = "+id+", href = "+href+", title = "+title+", type = "+type+"]";
    }
}