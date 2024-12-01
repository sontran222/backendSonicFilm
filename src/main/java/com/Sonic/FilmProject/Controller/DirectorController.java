package com.Sonic.FilmProject.Controller;

import com.Sonic.FilmProject.Entity.Director;
import com.Sonic.FilmProject.Mapper.DirectorMapper;
import com.Sonic.FilmProject.Repository.DirectorRepository;
import com.Sonic.FilmProject.Service.DirectorService;
import com.Sonic.FilmProject.dto.Request.DirectorRequest;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import com.Sonic.FilmProject.dto.Response.DirectorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @Autowired
    private DirectorMapper directorMapper;

    @PostMapping("/api/directors")
    public ApiResponse<DirectorResponse> createDirector(@RequestBody DirectorRequest request) {
        ApiResponse<DirectorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(directorMapper.toDirectorResponse(directorService.createDirector(request)));
        return apiResponse;
    }

    @GetMapping("/api/directors")
    public ApiResponse<List<DirectorResponse>> getDirectors() {
        ApiResponse<List<DirectorResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(directorMapper.toDirectorList(directorService.findAllDirectors()));
        return apiResponse;
    }

    @GetMapping("/api/directors/{id}")
    public ApiResponse<DirectorResponse> getDirector(@PathVariable String id) {
        ApiResponse<DirectorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(directorMapper.toDirectorResponse(directorService.getDirectorById(id)));
        return apiResponse;
    }
    @PutMapping("/api/directors/update/{id}")
    public ApiResponse<DirectorResponse> updateDirector(@PathVariable String id, @RequestBody DirectorRequest request) {
        ApiResponse<DirectorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(directorMapper.toDirectorResponse(directorService.updateDirector(request,id)));
        return apiResponse;
    }
    @DeleteMapping("/api/directors/delete/{id}")
    public ApiResponse deleteDirector(@PathVariable String id) {
        ApiResponse apiResponse = new ApiResponse<>();
        directorService.deleteDirector(id);
        apiResponse.setCode(1000);
        apiResponse.setMessage("Xóa giám đốc film thành công");
        return apiResponse;
    }
}
