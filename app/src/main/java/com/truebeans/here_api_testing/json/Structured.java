package com.truebeans.here_api_testing.json;

public class Structured
{
    private String duration;

    private String recurrence;

    private String start;

    public String getDuration ()
    {
        return duration;
    }

    public void setDuration (String duration)
    {
        this.duration = duration;
    }

    public String getRecurrence ()
    {
        return recurrence;
    }

    public void setRecurrence (String recurrence)
    {
        this.recurrence = recurrence;
    }

    public String getStart ()
    {
        return start;
    }

    public void setStart (String start)
    {
        this.start = start;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [duration = "+duration+", recurrence = "+recurrence+", start = "+start+"]";
    }
}