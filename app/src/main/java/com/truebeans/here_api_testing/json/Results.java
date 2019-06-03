package com.truebeans.here_api_testing.json;

public class Results
{
    private Items[] items;

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [items = "+items+"]";
    }
}