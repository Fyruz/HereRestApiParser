package com.truebeans.here_api_testing.json;

public class Location
{
    private Address address;

    private String[] position;

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public String[] getPosition ()
    {
        return position;
    }

    public void setPosition (String[] position)
    {
        this.position = position;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", position = "+position+"]";
    }
}