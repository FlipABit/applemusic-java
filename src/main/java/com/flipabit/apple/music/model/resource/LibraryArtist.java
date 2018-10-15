package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.relationship.LibraryAlbumRelationship;

import javax.validation.constraints.NotNull;

public class LibraryArtist extends Resource<LibraryArtist.Attributes, LibraryArtist.Relationships>
{
    @Override
    public String getType()
    {
        return "libraryArtists";
    }

    public static class Attributes
    {
        @NotNull
        private String name;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }

    public static class Relationships
    {
        private LibraryAlbumRelationship albums;
    }
}
