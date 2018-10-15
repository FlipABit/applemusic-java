package com.flipabit.apple.music.model.resource;

import javax.validation.constraints.NotNull;

public class Genre extends Resource<Genre.Attributes, Genre.Relationships>
{
    public String getType()
    {
        return "genres";
    }

    public static class Attributes
    {
        @NotNull
        private String name;

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

    }
}
