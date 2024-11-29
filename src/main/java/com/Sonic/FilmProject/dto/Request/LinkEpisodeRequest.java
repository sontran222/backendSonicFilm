package com.Sonic.FilmProject.dto.Request;

public class LinkEpisodeRequest {
    private String linkServer;
    private String slugFilmEpisode;

    public String getLinkServer() {
        return linkServer;
    }

    public void setLinkServer(String linkServer) {
        this.linkServer = linkServer;
    }

    public String getSlugFilmEpisode() {
        return slugFilmEpisode;
    }

    public void setSlugFilmEpisode(String slugFilmEpisode) {
        this.slugFilmEpisode = slugFilmEpisode;
    }
}
