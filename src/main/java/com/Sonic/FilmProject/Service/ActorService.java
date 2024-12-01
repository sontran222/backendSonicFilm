package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.Entity.Actor;
import com.Sonic.FilmProject.Mapper.ActorMapper;
import com.Sonic.FilmProject.Repository.ActorRepository;
import com.Sonic.FilmProject.dto.Request.ActorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
