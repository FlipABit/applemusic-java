package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.EditorialNotes;
import com.flipabit.apple.music.model.attribute.PlayParameters;
import com.flipabit.apple.music.model.relationship.CuratorRelationship;
import com.flipabit.apple.music.model.relationship.TrackRelationship;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Playlist extends Resource<Playlist.Attributes, Playlist.Relationships>
{
    public String getType()
    {
        return "playlists";
    }

    public static class Attributes
    {
        private Artwork artwork;

        private String curatorName;

        private EditorialNotes editorialNotes;

        @NotNull
        private Date lastModifiedDate;

        private String name;

        private PlayParameters playParams;

        public PlaylistType getPlaylistType()
        {
            return playlistType;
        }

        public void setPlaylistType(PlaylistType playlistType)
        {
            this.playlistType = playlistType;
        }

        @NotNull
        private String url;

        @NotNull
        private PlaylistType playlistType;

        public enum PlaylistType {
            USER_SHARED ("user-shared"),
            EDITORIAL ("editorial"),
            EXTERNAL ("external"),
            PERSONAL_MIX ("personal-mix");

            public String getType()
            {
                return name;
            }

            private final String name;

            private PlaylistType(String name)
            {
                this.name = name;
            }

            public String toString()
            {
                return this.name;
            }
        }

        public Artwork getArtwork()
        {
            return artwork;
        }

        public void setArtwork(Artwork artwork)
        {
            this.artwork = artwork;
        }

        public String getCuratorName()
        {
            return curatorName;
        }

        public void setCuratorName(String curatorName)
        {
            this.curatorName = curatorName;
        }

        public EditorialNotes getEditorialNotes()
        {
            return editorialNotes;
        }

        public void setEditorialNotes(EditorialNotes editorialNotes)
        {
            this.editorialNotes = editorialNotes;
        }

        public Date getLastModifiedDate()
        {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(Date lastModifiedDate)
        {
            this.lastModifiedDate = lastModifiedDate;
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

        public String getUrl()
        {
            return url;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }
    }

    public static class Relationships
    {
        private CuratorRelationship curators;

        private TrackRelationship tracks;

        public CuratorRelationship getCurators()
        {
            return curators;
        }

        public void setCurators(CuratorRelationship curators)
        {
            this.curators = curators;
        }

        public TrackRelationship getTracks()
        {
            return tracks;
        }

        public void setTracks(TrackRelationship tracks)
        {
            this.tracks = tracks;
        }
    }
}
