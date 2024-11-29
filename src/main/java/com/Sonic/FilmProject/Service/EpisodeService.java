package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.DefineSomethings.SlugUtils;
import com.Sonic.FilmProject.Entity.Episode;
import com.Sonic.FilmProject.Exception.AppException;
import com.Sonic.FilmProject.Exception.ErrorCode;
import com.Sonic.FilmProject.Mapper.EpisodeMapper;
import com.Sonic.FilmProject.Repository.EpisodeRepository;
import com.Sonic.FilmProject.dto.Request.EpisodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeService {
    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private EpisodeMapper episodeMapper;
    public Episode createEpisode(EpisodeRequest request) {
        String slugEpisodeFilm = SlugUtils.toSlugPlusEpisode(request.getSlug(), request.getEpisodeFilm());
        if(episodeRepository.existsEpisodeBySlugFilmEpisode(slugEpisodeFilm)){
            throw new AppException(ErrorCode.EPISODEFILMEXSTED);
        }
        Episode episode = episodeMapper.toEpisode(request);
        return episodeRepository.save(episode);
    }

    public List<Episode> getAllEpisodes() {
        return episodeRepository.findAll(Sort.by(Sort.Direction.DESC, "episodeFilm"));
    }
    public Episode getEpisodeById(String episodeId) {
        Episode episode = episodeRepository.findById(episodeId).orElseThrow(() -> new AppException(ErrorCode.EPISODEFILMNOTFOUND));
        return episode;
    }

    public Episode updateEpisode(EpisodeRequest request, String episodeId) {
        String slugFilmEpisode = SlugUtils.toSlugPlusEpisode(request.getSlug(), request.getEpisodeFilm());
        if(episodeRepository.existsEpisodeBySlugFilmEpisodeAndIdNot(slugFilmEpisode, episodeId)){
            throw new AppException(ErrorCode.EPISODEFILMEXSTED);
        }
        Episode episode = episodeRepository.findById(episodeId).orElseThrow(() -> new AppException(ErrorCode.EPISODEFILMNOTFOUND));
        episodeMapper.toEpisode(request);
        return episodeRepository.save(episode);
    }
    public void deleteEpisode(String episodeId) {
        Episode episode = episodeRepository.findById(episodeId).orElseThrow(() -> new AppException(ErrorCode.EPISODEFILMNOTFOUND));
        episodeRepository.delete(episode);
    }
}
