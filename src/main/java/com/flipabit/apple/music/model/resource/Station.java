package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.attribute.Artwork;
import com.flipabit.apple.music.model.attribute.EditorialNotes;

import javax.validation.constraints.NotNull;

public class Station extends Resource<Station.Attributes, Station.Relationships>
{

    public String getType()
    {
        return "stations";
    }

    public static class Attributes
    {
        @NotNull
        private Artwork artwork;

        private Long durationMillis;

        private EditorialNotes editorialNotes;

        private Integer episodeNumber;

        @NotNull
        private Boolean isLive;

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

        public Long getDurationMillis()
        {
            return durationMillis;
        }

        public void setDurationMillis(Long durationMillis)
        {
            this.durationMillis = durationMillis;
        }

        public EditorialNotes getEditorialNotes()
        {
            return editorialNotes;
        }

        public void setEditorialNotes(EditorialNotes editorialNotes)
        {
            this.editorialNotes = editorialNotes;
        }

        public Integer getEpisodeNumber()
        {
            return episodeNumber;
        }

        public void setEpisodeNumber(Integer episodeNumber)
        {
            this.episodeNumber = episodeNumber;
        }

        public Boolean getLive()
        {
            return isLive;
        }

        public void setLive(Boolean live)
        {
            isLive = live;
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

    }
}