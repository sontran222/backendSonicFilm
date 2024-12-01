package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.Entity.Director;
import com.Sonic.FilmProject.Exception.AppException;
import com.Sonic.FilmProject.Exception.ErrorCode;
import com.Sonic.FilmProject.Mapper.DirectorMapper;
import com.Sonic.FilmProject.Repository.DirectorRepository;
import com.Sonic.FilmProject.dto.Request.DirectorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    @Autowired
    private DirectorRepository directorRepository;
    @Autowired
    private DirectorMapper directorMapper;
    public Director createDirector(DirectorRequest request) {
        Director director = directorMapper.toDirector(request);
        return directorRepository.save(director);
    }
    public List<Director> findAllDirectors() {
        return directorRepository.findAll();
    }
    public Director getDirectorById(String id) {
        Director director = directorRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.DIRECTORNOTFOUND));
        return director;
    }
    public Director updateDirector(DirectorRequest request, String id) {
        Director director = directorRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.DIRECTORNOTFOUND));
        directorMapper.updateDirector(director, request);
        return directorRepository.save(director);
    }
    public void deleteDirector(String id) {
        Director director = directorRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.DIRECTORNOTFOUND));
        directorRepository.delete(director);
    }
}
