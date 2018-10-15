package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.EditorialNotes;
import com.flipabit.apple.music.model.attribute.PlayParameters;
import com.flipabit.apple.music.model.attribute.Preview;
import com.flipabit.apple.music.model.relationship.AlbumRelationship;
import com.flipabit.apple.music.model.relationship.ArtistRelationship;
import com.flipabit.apple.music.model.relationship.GenreRelationship;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;

public abstract class SongItem extends Resource<SongItem.Attributes, SongItem.Relationships>
{
    public static class Attributes
    {
        @NotNull
        private String albumName;

        @NotNull
        private String artistName;

        @NotNull
        private Artwork artwork;

        private Resource.ContentRating contentRating;

        private Long durationInMillis;

        private EditorialNotes editorialNotes;

        @NotEmpty
        private Set<String> genreNames;

        @NotNull
        private String isrc;

        @NotNull
        private String name;

        private PlayParameters playParams;

        @NotEmpty
        private List<Preview> previews;

        @NotNull
        private Date releaseDate;

        private Integer trackNumber;

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

        public EditorialNotes getEditorialNotes()
        {
            return editorialNotes;
        }

        public void setEditorialNotes(EditorialNotes editorialNotes)
        {
            this.editorialNotes = editorialNotes;
        }

        public Set<String> getGenreNames()
        {
            return genreNames;
        }

        public void setGenreNames(Set<String> genreNames)
        {
            this.genreNames = genreNames;
        }

        public String getIsrc()
        {
            return isrc;
        }

        public void setIsrc(String isrc)
        {
            this.isrc = isrc;
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

        public List<Preview> getPreviews()
        {
            return previews;
        }

        public void setPreviews(List<Preview> previews)
        {
            this.previews = previews;
        }

        public Date getReleaseDate()
        {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate)
        {
            this.releaseDate = releaseDate;
        }

        public Integer getTrackNumber()
        {
            return trackNumber;
        }

        public void setTrackNumber(Integer trackNumber)
        {
            this.trackNumber = trackNumber;
        }

        public String getUrl()
        {
            return url;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        private String url;
    }

    public static class Relationships
    {
        protected AlbumRelationship albums;

        protected ArtistRelationship artists;

        protected GenreRelationship  genres;

        public AlbumRelationship getAlbums()
        {
            return albums;
        }

        public void setAlbums(AlbumRelationship albums)
        {
            this.albums = albums;
        }

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
    }
}
