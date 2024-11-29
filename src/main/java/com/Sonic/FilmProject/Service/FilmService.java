package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.DefineSomethings.SlugUtils;
import com.Sonic.FilmProject.Entity.Film;
import com.Sonic.FilmProject.Exception.AppException;
import com.Sonic.FilmProject.Exception.ErrorCode;
import com.Sonic.FilmProject.Mapper.FilmMapper;
import com.Sonic.FilmProject.Repository.FilmRepository;
import com.Sonic.FilmProject.dto.Request.FilmRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private FilmMapper filmMapper;

    public Film createFilm(FilmRequest filmRequest) {
        String slugFilm = SlugUtils.toSlug(filmRequest.getName());
        if(filmRepository.existsBySlug(slugFilm)){
            throw new AppException(ErrorCode.FILMEXISTS);
        }
        Film film = filmMapper.toFilm(filmRequest);
        return filmRepository.save(film);
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll(Sort.by(Sort.Direction.DESC, "timeModified"));
    }

    public Film getFilmById(String id) {
        Film film = filmRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.FILMNOTFOUND));
        return film;
    }
    //search phim
    public List<Film> searchFilm(String item) {
        return filmRepository.findByNameContainingIgnoreCase(item);
    }

    //sửa sai những phần như link ảnh, tên  film
    public Film UpgradeFilm(FilmRequest filmRequest, String filmId) {
        String slugFilm = SlugUtils.toSlug(filmRequest.getName());
        if(filmRepository.existsBySlugAndIdNot(slugFilm, filmId)){
            throw new AppException(ErrorCode.FILMEXISTS);
        }
        Film film = filmRepository.findById(filmId).orElseThrow(() -> new AppException(ErrorCode.FILMNOTFOUND));
        filmMapper.updateFilm(film, filmRequest);
        film.setSlug(slugFilm);
        return filmRepository.save(film);
    }

    public void DeleteFilm(String filmId) {
        Film film = filmRepository.findById(filmId).orElseThrow(() -> new AppException(ErrorCode.FILMNOTFOUND));
        filmRepository.delete(film);
    }
}
