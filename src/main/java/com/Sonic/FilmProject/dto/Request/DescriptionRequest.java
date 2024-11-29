package com.Sonic.FilmProject.dto.Request;


public class DescriptionRequest {
    private String slug;
    private String content;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
