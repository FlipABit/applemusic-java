package com.flipabit.apple.music.model.resource;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Storefront extends Resource<Storefront.Attributes, Storefront.Relationships>
{
    public String getType()
    {
        return "storefronts";
    }

    public static class Attributes
    {
        @NotNull
        private String defaultLanguageTag;

        @NotNull
        private String name;

        @NotEmpty
        private List<String> supportedLanguageTags;

        public String getDefaultLanguageTag()
        {
            return defaultLanguageTag;
        }

        public void setDefaultLanguageTag(String defaultLanguageTag)
        {
            this.defaultLanguageTag = defaultLanguageTag;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public List<String> getSupportedLanguageTags()
        {
            return supportedLanguageTags;
        }

        public void setSupportedLanguageTags(List<String> supportedLanguageTags)
        {
            this.supportedLanguageTags = supportedLanguageTags;
        }
    }

    public static class Relationships
    {

    }
}
