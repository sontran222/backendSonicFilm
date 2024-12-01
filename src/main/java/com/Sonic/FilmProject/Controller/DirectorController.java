package com.Sonic.FilmProject.Controller;

import com.Sonic.FilmProject.Entity.Director;
import com.Sonic.FilmProject.Mapper.DirectorMapper;
import com.Sonic.FilmProject.Repository.DirectorRepository;
import com.Sonic.FilmProject.Service.DirectorService;
import com.Sonic.FilmProject.dto.Request.DirectorRequest;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import com.Sonic.FilmProject.dto.Response.DirectorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @Autowired
    private DirectorMapper directorMapper;

    @PostMapping("/directors")
    public ApiResponse<DirectorResponse> createDirector(@RequestBody DirectorRequest request) {
        ApiResponse<DirectorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(directorMapper.toDirectorResponse(directorService.createDirector(request)));
        return apiResponse;
    }

    @GetMapping("/directors")
    public ApiResponse<List<DirectorResponse>> getDirectors() {
        ApiResponse<List<DirectorResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(directorMapper.toDirectorList(directorService.findAllDirectors()));
        return apiResponse;
    }

   
}
