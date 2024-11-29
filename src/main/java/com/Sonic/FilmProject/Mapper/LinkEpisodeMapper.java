package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.LinkEpisode;
import com.Sonic.FilmProject.dto.Request.LinkEpisodeRequest;
import com.Sonic.FilmProject.dto.Response.LinkEpisodeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LinkEpisodeMapper {
    LinkEpisode toLinkEpisode(LinkEpisodeRequest request);
    LinkEpisodeResponse toLinkEpisodeResponse(LinkEpisode linkEpisode);
    List<LinkEpisodeResponse> toListLinkEpisodeResponse(List<LinkEpisode> linkEpisodes);
    void updateLinkEpisode(@MappingTarget LinkEpisode linkEpisode, LinkEpisodeRequest linkEpisodeRequest);
}
