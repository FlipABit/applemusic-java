package com.flipabit.apple.music.model.resource;

import javax.validation.constraints.NotNull;

public class LibrarySong extends LibrarySongItem
{
    @Override
    public String getType()
    {
        return "librarySongs";
    }

    public static class Attributes extends LibrarySongItem.Attributes
    {
        public Integer getDiscNumber()
        {
            return discNumber;
        }

        public void setDiscNumber(Integer discNumber)
        {
            this.discNumber = discNumber;
        }

        @NotNull
        private Integer discNumber;
    }
}
