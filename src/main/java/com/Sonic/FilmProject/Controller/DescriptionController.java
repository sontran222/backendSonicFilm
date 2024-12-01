package com.Sonic.FilmProject.Controller;

import com.Sonic.FilmProject.Entity.Description;
import com.Sonic.FilmProject.Mapper.DescriptionMapper;
import com.Sonic.FilmProject.Service.DesciptionService;
import com.Sonic.FilmProject.dto.Request.DescriptionRequest;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import com.Sonic.FilmProject.dto.Response.DescriptionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DescriptionController {
    @Autowired
    private DesciptionService desciptionService;

    @Autowired
    private DescriptionMapper descriptionMapper;

    @PostMapping("/api/descriptions")
    public ApiResponse<DescriptionResponse> createDescription(@RequestBody DescriptionRequest request) {
        ApiResponse<DescriptionResponse> apiResponse = new ApiResponse();
        apiResponse.setCode(1000);
        apiResponse.setResult(descriptionMapper.toDescriptionResponse(desciptionService.createDescription(request)));
        return apiResponse;
    }

    @GetMapping("/api/descriptions")
    public ApiResponse<List<DescriptionResponse>> getAllDescriptions() {
        ApiResponse<List<DescriptionResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(descriptionMapper.toListDescriptionResponse(desciptionService.getAllDescriptions()));
        return apiResponse;
    }

    @GetMapping("/api/descriptions/{slug}")
    public ApiResponse<DescriptionResponse> getDescription(@PathVariable String slug) {
        ApiResponse<DescriptionResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(descriptionMapper.toDescriptionResponse(desciptionService.getDescriptionBySlug(slug)));
        return apiResponse;
    }
    @PutMapping("/api/descriptions/update/{slug}")
    public ApiResponse<DescriptionResponse> updateDescription(@PathVariable String slug, @RequestBody DescriptionRequest request) {
        ApiResponse<DescriptionResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(descriptionMapper.toDescriptionResponse(desciptionService.updateDescriptionBySlug(slug, request)));
        return apiResponse;
    }

    @DeleteMapping("/api/descriptions/delete/{slug}")
    public ApiResponse deleteDescription(@PathVariable String slug) {
        ApiResponse apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        desciptionService.deleteDescriptionBySlug(slug);
        apiResponse.setMessage("Đã xóa thành công mô tả của phim");
        return apiResponse;
    }
}
