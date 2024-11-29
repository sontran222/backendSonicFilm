package com.Sonic.FilmProject.dto.Response;


public class EpisodeResponse {
    private String id;
    private String slug;
    private long episodeFilm;
    private String slugFilmEpisode;
    private long time;

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

    public long getEpisodeFilm() {
        return episodeFilm;
    }

    public void setEpisodeFilm(long episodeFilm) {
        this.episodeFilm = episodeFilm;
    }

    public String getSlugFilmEpisode() {
        return slugFilmEpisode;
    }

    public void setSlugFilmEpisode(String slugFilmEpisode) {
        this.slugFilmEpisode = slugFilmEpisode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
