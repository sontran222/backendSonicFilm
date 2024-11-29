package com.Sonic.FilmProject.dto.Response;


import java.time.LocalDateTime;

public class FilmResponse {
    private String id;
    private String name;
    private String slug;
    private String originName;
    private String posterURL;
    private String thumbURL;
    private int year;
    private boolean chieurap;
    private String trailer;
    private String type;
    private LocalDateTime timeModified;
    private String genreSlug;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    public String getThumbURL() {
        return thumbURL;
    }

    public void setThumbURL(String thumbURL) {
        this.thumbURL = thumbURL;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isChieurap() {
        return chieurap;
    }

    public void setChieurap(boolean chieurap) {
        this.chieurap = chieurap;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(LocalDateTime timeModified) {
        this.timeModified = timeModified;
    }

    public String getGenreSlug() {
        return genreSlug;
    }

    public void setGenreSlug(String genreSlug) {
        this.genreSlug = genreSlug;
    }

}
