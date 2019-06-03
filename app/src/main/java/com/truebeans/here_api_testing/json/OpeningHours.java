package com.truebeans.here_api_testing.json;

public class OpeningHours
{
    private String isOpen;

    private Structured[] structured;

    private String text;

    private String label;

    public String getIsOpen ()
    {
        return isOpen;
    }

    public void setIsOpen (String isOpen)
    {
        this.isOpen = isOpen;
    }

    public Structured[] getStructured ()
    {
        return structured;
    }

    public void setStructured (Structured[] structured)
    {
        this.structured = structured;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getLabel ()
    {
        return label;
    }

    public void setLabel (String label)
    {
        this.label = label;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isOpen = "+isOpen+", structured = "+structured+", text = "+text+", label = "+label+"]";
    }
}