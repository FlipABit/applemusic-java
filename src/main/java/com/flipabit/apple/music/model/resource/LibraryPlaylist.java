package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.LibraryTrackRelationship;
import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.PlayParameters;

import javax.validation.constraints.NotNull;

public class LibraryPlaylist extends Resource<LibraryPlaylist.Attributes, LibraryPlaylist.Relationships>
{
    @Override
    public String getType()
    {
        return "libraryPlaylists";
    }

    public static class Attributes
    {
        private Artwork artwork;

        private String descripton;

        @NotNull
        private String name;

        private PlayParameters playParams;

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

        public String getDescripton()
        {
            return descripton;
        }

        public void setDescripton(String descripton)
        {
            this.descripton = descripton;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public PlayParameters getPlayParams()
        {
            return playParams;
        }

        public void setPlayParams(PlayParameters playParams)
        {
            this.playParams = playParams;
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

    public static class Relationships
    {
        private LibraryTrackRelationship tracks;

        public LibraryTrackRelationship getTracks()
        {
            return tracks;
        }

        public void setTracks(LibraryTrackRelationship tracks)
        {
            this.tracks = tracks;
        }
    }
}
