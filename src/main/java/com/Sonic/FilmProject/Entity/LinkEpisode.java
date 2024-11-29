package com.Sonic.FilmProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LinkEpisode {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String linkServer;
    private String slugFilmEpisode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
