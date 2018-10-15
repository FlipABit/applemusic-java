package com.flipabit.apple.music.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class Error
{
    @NotNull
    protected String code;

    protected String detail;

    @NotNull
    protected String id;

    protected Source source;

    @NotNull
    protected String status;

    @NotNull
    protected String title;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Source getSource()
    {
        return source;
    }

    public void setSource(Source source)
    {
        this.source = source;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    protected static class Source {
        protected String parameter;

        protected Object jsonPointer;

        public void setParameter(String parameter) {
            this.parameter = parameter;
        }
    }

}
