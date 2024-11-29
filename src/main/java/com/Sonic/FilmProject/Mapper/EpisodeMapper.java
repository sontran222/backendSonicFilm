package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.Episode;
import com.Sonic.FilmProject.dto.Request.EpisodeRequest;
import com.Sonic.FilmProject.dto.Response.EpisodeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EpisodeMapper {
    Episode toEpisode(EpisodeRequest episodeRequest);
    EpisodeResponse toEpisodeResponse(Episode episode);
    List<EpisodeResponse> toListEpisodeResponse(List<Episode> episodeList);
    void UpdateEpisode(@MappingTarget Episode episode, EpisodeRequest episodeRequest);
}
