package com.flipabit.apple.music.model.attribute;

import com.flipabit.apple.music.model.attribute.Artwork;

public class Preview
{
    private Artwork artwork;

    private String url;

    public Artwork getArtwork()
    {
        return artwork;
    }

    public void setArtwork(Artwork artwork)
    {
        this.artwork = artwork;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
