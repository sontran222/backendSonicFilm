package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, String> {
    boolean existsBySlug(String slug);
    boolean existsBySlugAndIdNot(String slug, String id);
    Optional<Description> findBySlug(String slug);
}
