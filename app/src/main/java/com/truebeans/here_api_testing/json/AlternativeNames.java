package com.truebeans.here_api_testing.json;

public class AlternativeNames
{
    private String name;

    private String language;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", language = "+language+"]";
    }
}