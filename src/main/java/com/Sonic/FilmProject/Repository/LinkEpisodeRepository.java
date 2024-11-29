package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.LinkEpisode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkEpisodeRepository extends JpaRepository<LinkEpisode, String> {

}
