package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.Entity.Actor;
import com.Sonic.FilmProject.Exception.AppException;
import com.Sonic.FilmProject.Exception.ErrorCode;
import com.Sonic.FilmProject.Mapper.ActorMapper;
import com.Sonic.FilmProject.Repository.ActorRepository;
import com.Sonic.FilmProject.dto.Request.ActorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private ActorMapper actorMapper;

    public Actor createActor(ActorRequest request) {
        Actor actor = actorMapper.toActor(request);
        return actorRepository.save(actor);
    }

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor getActorById(String id) {
        Actor actor = actorRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.NOTFOUNDACTOR));
        return actor;
    }
    public Actor updateActor(ActorRequest request, String id) {
        Actor actor = actorRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.NOTFOUNDACTOR));
        actorMapper.updateActor(actor, request);
        return actorRepository.save(actor);
    }
    public void deleteActor(String id) {
        Actor actor = actorRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.NOTFOUNDACTOR));
        actorRepository.delete(actor);
    }
}
