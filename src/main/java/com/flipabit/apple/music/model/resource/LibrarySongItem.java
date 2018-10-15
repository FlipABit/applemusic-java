package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.PlayParameters;
import com.flipabit.apple.music.model.relationship.LibraryAlbumRelationship;
import com.flipabit.apple.music.model.relationship.LibraryArtistRelationship;

import javax.validation.constraints.NotNull;

public abstract class LibrarySongItem extends Resource<LibrarySongItem.Attributes, LibrarySongItem.Relationships>
{

    public static class Attributes
    {
        @NotNull
        protected String albumName;

        @NotNull
        protected String artistName;

        @NotNull
        protected Artwork artwork;

        protected ContentRating contentRating;

        protected Long durationInMillis;

        protected PlayParameters playParams;

        @NotNull
        protected Integer trackNumber;

        @NotNull
        protected String name;

        public String getAlbumName()
        {
            return albumName;
        }

        public void setAlbumName(String albumName)
        {
            this.albumName = albumName;
        }

        public String getArtistName()
        {
            return artistName;
        }

        public void setArtistName(String artistName)
        {
            this.artistName = artistName;
        }

        public Artwork getArtwork()
        {
            return artwork;
        }

        public void setArtwork(Artwork artwork)
        {
            this.artwork = artwork;
        }

        public ContentRating getContentRating()
        {
            return contentRating;
        }

        public void setContentRating(ContentRating contentRating)
        {
            this.contentRating = contentRating;
        }

        public Long getDurationInMillis()
        {
            return durationInMillis;
        }

        public void setDurationInMillis(Long durationInMillis)
        {
            this.durationInMillis = durationInMillis;
        }

        public PlayParameters getPlayParams()
        {
            return playParams;
        }

        public void setPlayParams(PlayParameters playParams)
        {
            this.playParams = playParams;
        }

        public Integer getTrackNumber()
        {
            return trackNumber;
        }

        public void setTrackNumber(Integer trackNumber)
        {
            this.trackNumber = trackNumber;
        }

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

        private LibraryArtistRelationship artists;

        public LibraryAlbumRelationship getAlbums()
        {
            return albums;
        }

        public void setAlbums(LibraryAlbumRelationship albums)
        {
            this.albums = albums;
        }

        public LibraryArtistRelationship getArtists()
        {
            return artists;
        }

        public void setArtists(LibraryArtistRelationship artists)
        {
            this.artists = artists;
        }
    }
}
