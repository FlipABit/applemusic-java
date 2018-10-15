package com.flipabit.apple.music.model.resource;

import com.flipabit.apple.music.model.relationship.StationRelationship;

import javax.validation.constraints.NotNull;

public class Song extends SongItem
{
    @Override
    public String getType()
    {
        return "songs";
    }

    public static class Attributes extends SongItem.Attributes
    {
        private String composerName;

        @NotNull
        private Integer discNumber;

        private Integer movementCount;

        private String movementName;

        private Integer movementNumber;

        private String workName;
    }

    public static class Relationships extends SongItem.Relationships
    {
        private StationRelationship stations;

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
