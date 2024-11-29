package com.Sonic.FilmProject.dto.Request;

public class EpisodeRequest {
    private String slug;
    private long episodeFilm;
    private String slugFilmEpisode;
    private long time;

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
