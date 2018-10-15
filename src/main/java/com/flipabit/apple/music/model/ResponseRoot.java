package com.flipabit.apple.music.model;

import java.util.List;

public abstract class ResponseRoot<T>
{
    protected T data;

    protected List<Error> errors;

    protected String href;

    protected String next;

    protected List<Object> results;

    protected Meta meta;

    public Meta getMeta()
    {
        return meta;
    }

    public void setMeta(Meta meta)
    {
        this.meta = meta;
    }

    public T getData() {
        return data;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public String getHref() {
        return href;
    }

    public String getNext() {
        return next;
    }

    protected class Meta {

    }

}
