package com.Sonic.FilmProject.Controller;


import com.Sonic.FilmProject.Mapper.ActorMapper;
import com.Sonic.FilmProject.Service.ActorService;
import com.Sonic.FilmProject.dto.Request.ActorRequest;
import com.Sonic.FilmProject.dto.Response.ActorResponse;
import com.Sonic.FilmProject.dto.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;
    @Autowired
    private ActorMapper actorMapper;

    @PostMapping("/api/actors")
    public ApiResponse<ActorResponse> createActor(@RequestBody ActorRequest request) {
        ApiResponse<ActorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(actorMapper.toActorResponse(actorService.createActor(request)));
        return apiResponse;
    }

    @GetMapping("/api/actors")
    public ApiResponse<List<ActorResponse>> getAllActors() {
        ApiResponse<List<ActorResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(actorMapper.toListActorResponse(actorService.getAllActors()));
        return apiResponse;
    }
    @GetMapping("/api/actors/{id}")
    public ApiResponse<ActorResponse> getActorById(@PathVariable("id") String id) {
        ApiResponse<ActorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(actorMapper.toActorResponse(actorService.getActorById(id)));
        return apiResponse;
    }
    @PutMapping("/api/actors/update/{id}")
    public ApiResponse<ActorResponse> updateActor(@PathVariable("id") String id, @RequestBody ActorRequest request) {
        ApiResponse<ActorResponse> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(actorMapper.toActorResponse(actorService.updateActor(request,id)));
        return apiResponse;
    }
    @DeleteMapping("/api/actors/delete/{id}")
    public ApiResponse deleteActor(@PathVariable("id") String id) {
        ApiResponse apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        actorService.deleteActor(id);
        apiResponse.setMessage("Đã xóa thành công diễn viên");
        return apiResponse;
    }
}
