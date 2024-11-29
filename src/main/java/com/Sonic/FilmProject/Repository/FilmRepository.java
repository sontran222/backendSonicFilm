package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, String> {
    List<Film> findByNameContainingIgnoreCase(String name);
    boolean existsBySlug(String slug);
    boolean existsBySlugAndIdNot(String slug, String id);
}
