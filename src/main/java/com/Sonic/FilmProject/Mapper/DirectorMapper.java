package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.Director;
import com.Sonic.FilmProject.dto.Request.DirectorRequest;
import com.Sonic.FilmProject.dto.Response.DirectorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface DirectorMapper {
    Director toDirector(DirectorRequest directorRequest);
    DirectorResponse toDirectorResponse(Director director);
    List<DirectorResponse> toDirectorList(List<Director> directorList);
    void updateDirector(@MappingTarget Director director, DirectorRequest directorRequest);
}
