package com.Sonic.FilmProject.Controller;

import com.Sonic.FilmProject.Entity.Film;
import com.Sonic.FilmProject.Mapper.FilmMapper;
import com.Sonic.FilmProject.Service.FilmService;
import com.Sonic.FilmProject.dto.Request.FilmRequest;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import com.Sonic.FilmProject.dto.Response.FilmResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {
    @Autowired
    private FilmService filmService;
    @Autowired
    private FilmMapper filmMapper;

    //api up phim
    @PostMapping("/api/films")
    public ApiResponse<FilmResponse> createFilm(@RequestBody FilmRequest request) {
        Film film = filmService.createFilm(request);
        ApiResponse<FilmResponse> apiResponse = new ApiResponse();
        apiResponse.setCode(1000);
        apiResponse.setResult(filmMapper.toFilmResponse(film));
        return apiResponse;
    }
    //api lấy phim
    @GetMapping("/api/films")
    public ApiResponse<List<FilmResponse>> getAllFilms() {
        List<Film> films = filmService.getAllFilms();
        ApiResponse<List<FilmResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(filmMapper.toFilmResponseList(films));
        return apiResponse;
    }
    //api phục vụ việc tìm kiếm backend
    @GetMapping("/api/films/search/{item}")
    public ApiResponse<List<FilmResponse>> searchFilm(@PathVariable String item) {
        List<Film> films = filmService.searchFilm(item);
        ApiResponse<List<FilmResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(filmMapper.toFilmResponseList(films));
        return apiResponse;
    }

    @GetMapping("/api/films/{filmid}")
    public ApiResponse<FilmResponse> getFilmById(@PathVariable String filmid) {
        Film film = filmService.getFilmById(filmid);
        ApiResponse<FilmResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(filmMapper.toFilmResponse(film));
        return apiResponse;
    }

    @PutMapping("/api/films/update/{filmid}")
    public ApiResponse<FilmResponse> updateFilm(@PathVariable String filmid, @RequestBody FilmRequest request) {
        ApiResponse<FilmResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        Film film = filmService.UpgradeFilm(request,filmid);
        apiResponse.setResult(filmMapper.toFilmResponse(film));
        return apiResponse;
    }
    @DeleteMapping("/api/films/delete/{filmid}")
    public ApiResponse deleteFilm(@PathVariable String filmid) {
        ApiResponse apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        filmService.DeleteFilm(filmid);
        apiResponse.setMessage("Đã xóa film thành công");
        return apiResponse;
    }




}
