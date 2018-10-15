package com.flipabit.apple.music.model.attribute;

import javax.validation.constraints.NotNull;

public class PlayParameters
{
    @NotNull
    private String id;

    @NotNull
    private String kind;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getKind()
    {
        return kind;
    }

    public void setKind(String kind)
    {
        this.kind = kind;
    }
}
