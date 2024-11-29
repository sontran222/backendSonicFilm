package com.Sonic.FilmProject.dto.Request;

public class StatusRequest {
    private String slug;
    private String filmStatus;
    private String episodeCurrent;
    private String slugFilmStatus;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(String filmStatus) {
        this.filmStatus = filmStatus;
    }

    public String getEpisodeCurrent() {
        return episodeCurrent;
    }

    public void setEpisodeCurrent(String episodeCurrent) {
        this.episodeCurrent = episodeCurrent;
    }

    public String getSlugFilmStatus() {
        return slugFilmStatus;
    }

    public void setSlugFilmStatus(String slugFilmStatus) {
        this.slugFilmStatus = slugFilmStatus;
    }
}
