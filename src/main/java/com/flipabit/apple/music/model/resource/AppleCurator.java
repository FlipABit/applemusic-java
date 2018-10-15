package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.EditorialNotes;
import com.flipabit.apple.music.model.relationship.PlaylistRelationship;

import javax.validation.constraints.NotNull;

public class AppleCurator extends Resource<AppleCurator.Attributes, AppleCurator.Relationships>
{
    @Override
    public String getType()
    {
        return "appleCurators";
    }

    public static class Attributes
    {
        @NotNull
        private Artwork artwork;

        private EditorialNotes editorialNotes;

        @NotNull
        private String name;

        @NotNull
        private String url;

        public Artwork getArtwork()
        {
            return artwork;
        }

        public void setArtwork(Artwork artwork)
        {
            this.artwork = artwork;
        }

        public EditorialNotes getEditorialNotes()
        {
            return editorialNotes;
        }

        public void setEditorialNotes(EditorialNotes editorialNotes)
        {
            this.editorialNotes = editorialNotes;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
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

    public class Relationships
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
