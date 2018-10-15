package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.LibraryTrackRelationship;
import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.PlayParameters;
import com.flipabit.apple.music.model.relationship.LibraryArtistRelationship;

import javax.validation.constraints.NotNull;

public class LibraryAlbum extends Resource<LibraryAlbum.Attributes, LibraryAlbum.Relationships>
{
    @Override
    public String getType()
    {
        return "libraryAlbums";
    }

    public static class Attributes
    {
        @NotNull
        private String artistName;

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

        public Integer getTrackCount()
        {
            return trackCount;
        }

        public void setTrackCount(Integer trackCount)
        {
            this.trackCount = trackCount;
        }

        @NotNull
        private Artwork artwork;

        private ContentRating contentRating;

        @NotNull
        private String name;

        private PlayParameters playParams;

        @NotNull
        private Integer trackCount;
    }

    public static class Relationships
    {
        private LibraryArtistRelationship artists;

        private LibraryTrackRelationship tracks;

        public LibraryArtistRelationship getArtists()
        {
            return artists;
        }

        public void setArtists(LibraryArtistRelationship artists)
        {
            this.artists = artists;
        }

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
