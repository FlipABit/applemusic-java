package com.flipabit.apple.music.model.resource;


import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.EditorialNotes;
import com.flipabit.apple.music.model.attribute.PlayParameters;
import com.flipabit.apple.music.model.relationship.ArtistRelationship;
import com.flipabit.apple.music.model.relationship.GenreRelationship;
import com.flipabit.apple.music.model.relationship.TrackRelationship;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class Album extends Resource<Album.Attributes, Album.Relationships>
{
    @Override
    public String getType()
    {
        return "albums";
    }

    public static class Attributes {
        @NotNull
        private String albumName;

        @NotNull
        private String artistName;

        private Artwork artowrk;

        private String contentRating;

        private String copyright;

        private EditorialNotes editorialNotes;

        private List<String> genreNames;

        @NotNull
        private Boolean isComplete;

        @NotNull
        private Boolean isSingle;

        @NotNull
        private String name;

        private PlayParameters playParams;

        @NotNull
        private String recordLabel;

        @NotNull
        private Date releaseDate;

        @NotNull
        private Integer trackCount;

        @NotNull
        private String url;

        @NotNull
        private Boolean isMasteredForItunes;

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

        public Artwork getArtowrk()
        {
            return artowrk;
        }

        public void setArtowrk(Artwork artowrk)
        {
            this.artowrk = artowrk;
        }

        public String getContentRating()
        {
            return contentRating;
        }

        public void setContentRating(String contentRating)
        {
            this.contentRating = contentRating;
        }

        public String getCopyright()
        {
            return copyright;
        }

        public void setCopyright(String copyright)
        {
            this.copyright = copyright;
        }

        public EditorialNotes getEditorialNotes()
        {
            return editorialNotes;
        }

        public void setEditorialNotes(EditorialNotes editorialNotes)
        {
            this.editorialNotes = editorialNotes;
        }

        public List<String> getGenreNames()
        {
            return genreNames;
        }

        public void setGenreNames(List<String> genreNames)
        {
            this.genreNames = genreNames;
        }

        public Boolean getComplete()
        {
            return isComplete;
        }

        public void setComplete(Boolean complete)
        {
            isComplete = complete;
        }

        public Boolean getSingle()
        {
            return isSingle;
        }

        public void setSingle(Boolean single)
        {
            isSingle = single;
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

        public String getRecordLabel()
        {
            return recordLabel;
        }

        public void setRecordLabel(String recordLabel)
        {
            this.recordLabel = recordLabel;
        }

        public Date getReleaseDate()
        {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate)
        {
            this.releaseDate = releaseDate;
        }

        public Integer getTrackCount()
        {
            return trackCount;
        }

        public void setTrackCount(Integer trackCount)
        {
            this.trackCount = trackCount;
        }

        public String getUrl()
        {
            return url;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public Boolean getMasteredForItunes()
        {
            return isMasteredForItunes;
        }

        public void setMasteredForItunes(Boolean masteredForItunes)
        {
            isMasteredForItunes = masteredForItunes;
        }
    }

    public static class Relationships
    {
        private GenreRelationship genres;

        private TrackRelationship tracks;

        private ArtistRelationship artists;

        public ArtistRelationship getArtists()
        {
            return artists;
        }

        public void setArtists(ArtistRelationship artists)
        {
            this.artists = artists;
        }

        public GenreRelationship getGenres()
        {
            return genres;
        }

        public void setGenres(GenreRelationship genres)
        {
            this.genres = genres;
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
