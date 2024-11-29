package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.Film;
import com.Sonic.FilmProject.dto.Request.FilmRequest;
import com.Sonic.FilmProject.dto.Response.FilmResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    Film toFilm(FilmRequest request);
    FilmResponse toFilmResponse(Film request);
    List<FilmResponse> toFilmResponseList(List<Film> films);
    void updateFilm(@MappingTarget Film film, FilmRequest request);
}
