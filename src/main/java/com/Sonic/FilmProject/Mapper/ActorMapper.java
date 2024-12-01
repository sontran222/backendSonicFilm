package com.Sonic.FilmProject.Mapper;

import com.Sonic.FilmProject.Entity.Actor;
import com.Sonic.FilmProject.dto.Request.ActorRequest;
import com.Sonic.FilmProject.dto.Response.ActorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActorMapper {
    Actor toActor(ActorRequest actorRequest);
    ActorResponse toActorResponse(Actor actor);
    List<ActorResponse> toListActorResponse(List<Actor> actors);
    void updateActor(@MappingTarget Actor actor, ActorRequest actorRequest);
}
