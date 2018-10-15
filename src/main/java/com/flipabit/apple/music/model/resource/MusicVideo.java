package com.flipabit.apple.music.model.resource;

import javax.validation.constraints.NotNull;

public class MusicVideo extends SongItem
{
    public String getType()
    {
        return "musicVideos";
    }

    public static class Attributes extends SongItem.Attributes
    {
        private String videoSubType;

        @NotNull
        private Boolean hasHDR;

        @NotNull
        private Boolean has4K;
    }

}
