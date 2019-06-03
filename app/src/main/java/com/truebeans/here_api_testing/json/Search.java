package com.truebeans.here_api_testing.json;


public class Search
{
    private Context context;

    public Context getContext ()
    {
        return context;
    }

    public void setContext (Context context)
    {
        this.context = context;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [context = "+context+"]";
    }
}

