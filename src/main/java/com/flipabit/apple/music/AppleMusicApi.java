package com.flipabit.apple.music;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import java.util.logging.Logger;

/**
 * Used to interact with the Apple Music API.
 */
public class AppleMusicApi
{

    /**
     * Default hostname for the Apple Music API.
     */
    public static final String DEFAULT_HOST = "api.music.apple.com";

    /**
     * Default HTTP scheme for the Apple Music API.
     */
    public static final String DEFAULT_SCHEME = "https";

    /**
     * Default API version for the Apple Music API.
     */
    public static final String DEFAULT_API_VERSION = "v1";

    public static final Logger LOGGER = Logger.getLogger(AppleMusicApi.class.getName());

    private final String host;
    private final String scheme;
    private final String apiVesion;
    private String developerToken;
    private String musicUserToken;

    private AppleMusicApi(Builder builder)
    {
        this.host = builder.host;
        this.scheme = builder.scheme;
        this.apiVesion = builder.apiVersion;
        this.developerToken = builder.developerToken;
        this.musicUserToken = builder.musicUserToken;
    }

    public String getHost()
    {
        return host;
    }

    public String getScheme()
    {
        return scheme;
    }

    public String getApiVesion()
    {
        return apiVesion;
    }

    public String getDeveloperToken()
    {
        return developerToken;
    }

    public void setDeveloperToken(String developerToken)
    {
        this.developerToken = developerToken;
    }

    public String getMusicUserToken()
    {
        return musicUserToken;
    }

    public void setMusicUserToken(String musicUserToken)
    {
        this.musicUserToken = musicUserToken;
    }

    /**
     * Builds an instance of the {@link AppleMusicApi}
     */
    public static class Builder
    {
        private String host = DEFAULT_HOST;
        private String scheme = DEFAULT_SCHEME;
        private String apiVersion = DEFAULT_API_VERSION;
        private String developerToken;
        private String musicUserToken;

        public Builder setScheme(String scheme)
        {
            this.scheme = scheme;
            return this;
        }

        public Builder setHost(String host)
        {
            this.host = host;
            return this;
        }

        public Builder setApiVersion(String apiVersion)
        {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setDeveloperToken(String developerToken)
        {
            this.developerToken = developerToken;
            return this;
        }

        public Builder setMusicUserToken(String musicUserToken)
        {
            this.musicUserToken = musicUserToken;
            return this;
        }

        public AppleMusicApi build()
        {
            return new AppleMusicApi(this);
        }
    }

}
