package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, String> {

}
