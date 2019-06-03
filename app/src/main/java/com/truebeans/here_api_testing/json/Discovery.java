package com.truebeans.here_api_testing.json;

public class Discovery
{
    private Search search;

    private Results results;

    public Search getSearch ()
    {
        return search;
    }

    public void setSearch (Search search)
    {
        this.search = search;
    }

    public Results getResults ()
    {
        return results;
    }

    public void setResults (Results results)
    {
        this.results = results;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [search = "+search+", results = "+results+"]";
    }
}