package com.truebeans.here_api_testing.json;

public class Address
{
    private String country;

    private String city;

    private String street;

    private String countryCode;

    private String postalCode;

    private String county;

    private String stateCode;

    private String text;

    private String house;

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getCountryCode ()
    {
        return countryCode;
    }

    public void setCountryCode (String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getPostalCode ()
    {
        return postalCode;
    }

    public void setPostalCode (String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getCounty ()
    {
        return county;
    }

    public void setCounty (String county)
    {
        this.county = county;
    }

    public String getStateCode ()
    {
        return stateCode;
    }

    public void setStateCode (String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getHouse ()
    {
        return house;
    }

    public void setHouse (String house)
    {
        this.house = house;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", city = "+city+", street = "+street+", countryCode = "+countryCode+", postalCode = "+postalCode+", county = "+county+", stateCode = "+stateCode+", text = "+text+", house = "+house+"]";
    }
}