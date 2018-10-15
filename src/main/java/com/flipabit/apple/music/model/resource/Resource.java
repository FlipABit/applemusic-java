package com.flipabit.apple.music.model.resource;

import javax.validation.constraints.NotNull;


public abstract class Resource<A, R>
{
    protected A attributes;

    protected String href;

    @NotNull
    protected String id;

    protected R relationships;

    protected Object Meta;

    public enum ContentRating
    {
        explicit,
        clean
    }

    public A getAttributes()
    {
        return attributes;
    }

    public void setAttributes(A attributes)
    {
        this.attributes = attributes;
    }

    public String getHref()
    {
        return href;
    }

    public void setHref(String href)
    {
        this.href = href;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public R getRelationships()
    {
        return relationships;
    }

    public void setRelationships(R relationships)
    {
        this.relationships = relationships;
    }

    public abstract String getType();

    public Object getMeta()
    {
        return Meta;
    }

    public void setMeta(Object meta)
    {
        Meta = meta;
    }
}
