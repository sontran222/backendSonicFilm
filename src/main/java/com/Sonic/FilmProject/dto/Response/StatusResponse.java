package com.Sonic.FilmProject.dto.Response;


public class StatusResponse {
    private String id;
    private String slug;
    private String filmStatus;
    private String episodeCurrent;
    private String slugFilmStatus;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
}
