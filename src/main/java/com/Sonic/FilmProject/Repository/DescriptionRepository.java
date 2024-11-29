package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, String> {

}
