package com.Sonic.FilmProject.Controller;

import com.Sonic.FilmProject.Mapper.LinkEpisodeMapper;
import com.Sonic.FilmProject.Service.LinkEpisodeService;
import com.Sonic.FilmProject.dto.Request.LinkEpisodeRequest;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import com.Sonic.FilmProject.dto.Response.LinkEpisodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LinkEpisodeController {
    @Autowired
    private LinkEpisodeService linkEpisodeService;
    @Autowired
    private LinkEpisodeMapper linkEpisodeMapper;

    @PostMapping("/api/linkEpisodes")
    public ApiResponse<LinkEpisodeResponse> createLinkEpisode(@RequestBody LinkEpisodeRequest linkEpisodeRequest) {
        ApiResponse<LinkEpisodeResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(linkEpisodeMapper.toLinkEpisodeResponse(linkEpisodeService.createLinkEpisode(linkEpisodeRequest)));
        return apiResponse;
    }

    @GetMapping("/api/linkEpisodes")
    public ApiResponse<List<LinkEpisodeResponse>> getLinkEpisodes() {
        ApiResponse<List<LinkEpisodeResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(linkEpisodeMapper.toListLinkEpisodeResponse(linkEpisodeService.getAllLinkEpisodes()));
        return apiResponse;
    }

    @GetMapping("/api/linkEpisodes/{id}")
    public ApiResponse<LinkEpisodeResponse> getLinkEpisode(@PathVariable String id) {
        ApiResponse<LinkEpisodeResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(linkEpisodeMapper.toLinkEpisodeResponse(linkEpisodeService.getLinkEpisodeById(id)));
        return apiResponse;
    }

    @PutMapping("/api/linkEpisodes/update/{id}")
    public ApiResponse<LinkEpisodeResponse> updateLinkEpisode(@PathVariable String id, @RequestBody LinkEpisodeRequest linkEpisodeRequest) {
        ApiResponse<LinkEpisodeResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(linkEpisodeMapper.toLinkEpisodeResponse(linkEpisodeService.updateLinkEpisode(linkEpisodeRequest, id)));
        return apiResponse;
    }

    @DeleteMapping("/api/linkEpisodes/delete/{id}")
    public ApiResponse deleteLinkEpisode(@PathVariable String id) {
        ApiResponse apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        linkEpisodeService.deleteLinkEpisode(id);
        apiResponse.setMessage("Đã xóa thành công link phim");
        return apiResponse;
    }
}
