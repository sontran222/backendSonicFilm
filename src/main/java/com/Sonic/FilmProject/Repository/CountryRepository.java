package com.Sonic.FilmProject.Repository;

import com.Sonic.FilmProject.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
