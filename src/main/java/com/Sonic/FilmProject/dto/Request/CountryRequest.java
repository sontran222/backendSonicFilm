package com.Sonic.FilmProject.dto.Request;

public class CountryRequest {
    private String slug;
    private String countryName;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
