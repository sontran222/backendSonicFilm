package com.Sonic.FilmProject.dto.Request;

public class CategoryRequest {
    private String filmCategory;
    private String slugCategory;

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String filmCategory) {
        this.filmCategory = filmCategory;
    }

    public String getSlugCategory() {
        return slugCategory;
    }

    public void setSlugCategory(String slugCategory) {
        this.slugCategory = slugCategory;
    }
}
