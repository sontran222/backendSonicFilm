package com.Sonic.FilmProject.Controller;

import com.Sonic.FilmProject.Mapper.EpisodeMapper;
import com.Sonic.FilmProject.Service.EpisodeService;
import com.Sonic.FilmProject.dto.Request.EpisodeRequest;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import com.Sonic.FilmProject.dto.Response.EpisodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EpisodeController {
    @Autowired
    private EpisodeService episodeService;
    @Autowired
    private EpisodeMapper episodeMapper;
    @PostMapping("/api/episodes")
    public ApiResponse<EpisodeResponse> createEpisode(@RequestBody EpisodeRequest request){
        ApiResponse<EpisodeResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(episodeMapper.toEpisodeResponse(episodeService.createEpisode(request)));
        return apiResponse;
    }

    @GetMapping("/api/episodes/{Episodeid}")
    public ApiResponse<EpisodeResponse> getEpisode(@PathVariable String Episodeid){
        ApiResponse<EpisodeResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(episodeMapper.toEpisodeResponse(episodeService.getEpisodeById(Episodeid)));
        return apiResponse;
    }

    @GetMapping("/api/episodes")
    public ApiResponse<List<EpisodeResponse>> getAllEpisodes(){
        ApiResponse<List<EpisodeResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(episodeMapper.toListEpisodeResponse(episodeService.getAllEpisodes()));
        return apiResponse;
    }

    @PutMapping("/api/episodes/{Episodeid}")
    public ApiResponse<EpisodeResponse> updateEpisode(@RequestBody EpisodeRequest request, @PathVariable String Episodeid){
        ApiResponse<EpisodeResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(episodeMapper.toEpisodeResponse(episodeService.updateEpisode(request,Episodeid)));
        return apiResponse;
    }
}
