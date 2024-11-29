package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, String> {
    boolean existsEpisodeBySlugFilmEpisode(String episode);
    boolean existsEpisodeBySlugFilmEpisodeAndIdNot(String episode, String id);
}
