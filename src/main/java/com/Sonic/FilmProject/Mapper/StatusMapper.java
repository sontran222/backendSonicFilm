package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.Status;
import com.Sonic.FilmProject.dto.Request.StatusRequest;
import com.Sonic.FilmProject.dto.Response.StatusResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StatusMapper {
    Status toStatus(StatusRequest request);
    StatusResponse toStatusResponse(Status status);
    List<StatusResponse> toListStatusResponse(List<Status> statuses);
    void updateStatus(@MappingTarget Status status, StatusRequest request);
}
