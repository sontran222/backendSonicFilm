package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, String>{
}
