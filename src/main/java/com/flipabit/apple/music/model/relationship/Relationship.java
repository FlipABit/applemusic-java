package com.flipabit.apple.music.model.relationship;

import java.util.List;

public abstract class Relationship<T>
{
    protected List<T> data;

    protected String href;

    public List<T> getData()
    {
        return data;
    }

    public void setData(List<T> data)
    {
        this.data = data;
    }

    public String getHref()
    {
        return href;
    }

    public void setHref(String href)
    {
        this.href = href;
    }

    public Meta getMeta()
    {
        return meta;
    }

    public void setMeta(Meta meta)
    {
        this.meta = meta;
    }

    public String getNext()
    {
        return next;
    }

    public void setNext(String next)
    {
        this.next = next;
    }

    protected Meta meta;

    protected String next;

    public static class Meta
    {

    }
}
