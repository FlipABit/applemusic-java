package com.flipabit.apple.music.model.resource;

import javax.validation.constraints.NotNull;

public class Rating extends Resource<Rating.Attributes, Rating.Relationships>
{
    public String getType()
    {
        return "ratings";
    }

    public static class Attributes
    {
        public Integer getValue()
        {
            return value;
        }

        public void setValue(Integer value)
        {
            this.value = value;
        }

        @NotNull
        private Integer value;
    }

    public static class Relationships
    {

    }
}
