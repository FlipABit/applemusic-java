package com.flipabit.apple.music.model;

import com.flipabit.apple.music.model.attribute.Artwork;

import javax.validation.constraints.NotNull;

/**
 * Created by brendanmorante on 9/14/18.
 */
public class LibraryPlaylist
{

    private Attributes attributes;

    //private Relationships relationships;

    protected static class Attributes {
        private Artwork artwork;

        private String description;

        @NotNull
        private String name;

        @NotNull
        private Boolean canEdit;

        public Artwork getArtwork()
        {
            return artwork;
        }

        public void setArtwork(Artwork artwork)
        {
            this.artwork = artwork;
        }

        public String getDescription()
        {
            return description;
        }

        public void setDescription(String description)
        {
            this.description = description;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public Boolean getCanEdit()
        {
            return canEdit;
        }

        public void setCanEdit(Boolean canEdit)
        {
            this.canEdit = canEdit;
        }
    }

    /*protected static class Relationships {
        public List<LibraryTrackRelationship> getTracks()
        {
            return tracks;
        }

        public void setTracks(List<LibraryTrackRelationship> tracks)
        {
            this.tracks = tracks;
        }

        private List<LibraryTrackRelationship> tracks;
    }*/
}
