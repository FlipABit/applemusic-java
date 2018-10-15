package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.EditorialNotes;
import com.flipabit.apple.music.model.relationship.AlbumRelationship;
import com.flipabit.apple.music.model.relationship.GenreRelationship;
import com.flipabit.apple.music.model.relationship.MusicVideoRelationship;
import com.flipabit.apple.music.model.relationship.PlaylistRelationship;
import com.flipabit.apple.music.model.relationship.StationRelationship;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class Artist extends Resource<Artist.Attributes, Artist.Relationships>
{
    @Override
    public String getType()
    {
        return "artists";
    }

    public class Attributes
    {

        private EditorialNotes editorialNotes;

        @NotNull
        private Set<String> genreNames;

        @NotNull
        private String name;

        @NotNull
        private String url;

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

    public static class Relationships
    {
        private AlbumRelationship albums;

        private GenreRelationship genres;

        private MusicVideoRelationship musicVideos;

        private PlaylistRelationship playlists;

        private StationRelationship stations;

        public AlbumRelationship getAlbums()
        {
            return albums;
        }

        public void setAlbums(AlbumRelationship albums)
        {
            this.albums = albums;
        }

        public GenreRelationship getGenres()
        {
            return genres;
        }

        public void setGenres(GenreRelationship genres)
        {
            this.genres = genres;
        }

        public MusicVideoRelationship getMusicVideos()
        {
            return musicVideos;
        }

        public void setMusicVideos(MusicVideoRelationship musicVideos)
        {
            this.musicVideos = musicVideos;
        }

        public PlaylistRelationship getPlaylists()
        {
            return playlists;
        }

        public void setPlaylists(PlaylistRelationship playlists)
        {
            this.playlists = playlists;
        }

        public StationRelationship getStations()
        {
            return stations;
        }

        public void setStations(StationRelationship stations)
        {
            this.stations = stations;
        }
    }
}
