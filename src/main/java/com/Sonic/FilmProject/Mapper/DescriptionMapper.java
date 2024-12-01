package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.Description;
import com.Sonic.FilmProject.dto.Request.DescriptionRequest;
import com.Sonic.FilmProject.dto.Response.DescriptionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DescriptionMapper {
    Description toDescription(DescriptionRequest descriptionRequest);
    DescriptionResponse toDescriptionResponse(Description description);
    List<DescriptionResponse> toListDescriptionResponse(List<Description> descriptions);
    void updateDescription(@MappingTarget Description description, DescriptionRequest descriptionRequest);
}
