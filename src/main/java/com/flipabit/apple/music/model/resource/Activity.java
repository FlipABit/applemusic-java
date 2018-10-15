package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.EditorialNotes;
import com.flipabit.apple.music.model.relationship.PlaylistRelationship;

import javax.validation.constraints.NotNull;

public class Activity extends Resource<Activity.Attributes, Activity.Relationships>
{
    protected PlaylistRelationship relationships;

    public String getType()
    {
        return "activities";
    }

    public static class Attributes {

        public void setArtwork(Artwork artwork)
        {
            this.artwork = artwork;
        }

        public void setEditorialNotes(EditorialNotes editorialNotes)
        {
            this.editorialNotes = editorialNotes;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public Artwork getArtwork()
        {
            return artwork;
        }

        public EditorialNotes getEditorialNotes()
        {
            return editorialNotes;
        }

        public String getName()
        {
            return name;
        }

        public String getUrl()
        {
            return url;
        }

        @NotNull
        private Artwork artwork;

        private EditorialNotes editorialNotes;

        @NotNull
        private String name;

        @NotNull
        private String url;
    }

    public static class Relationships
    {
        private PlaylistRelationship playlists;

        public PlaylistRelationship getPlaylists()
        {
            return playlists;
        }

        public void setPlaylists(PlaylistRelationship playlists)
        {
            this.playlists = playlists;
        }
    }
}
