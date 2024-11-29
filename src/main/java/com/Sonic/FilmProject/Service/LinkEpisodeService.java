package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.Entity.LinkEpisode;
import com.Sonic.FilmProject.Exception.AppException;
import com.Sonic.FilmProject.Exception.ErrorCode;
import com.Sonic.FilmProject.Mapper.LinkEpisodeMapper;
import com.Sonic.FilmProject.Repository.LinkEpisodeRepository;
import com.Sonic.FilmProject.dto.Request.LinkEpisodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkEpisodeService {
    @Autowired
    private LinkEpisodeRepository linkEpisodeRepository;

    @Autowired
    private LinkEpisodeMapper linkEpisodeMapper;

    public LinkEpisode createLinkEpisode(LinkEpisodeRequest request) {
        LinkEpisode linkEpisode = linkEpisodeMapper.toLinkEpisode(request);
        return linkEpisodeRepository.save(linkEpisode);
    }
    public List<LinkEpisode> getAllLinkEpisodes() {
        return linkEpisodeRepository.findAll();
    }
    public LinkEpisode getLinkEpisodeById(String linkEpisodeId) {
        LinkEpisode linkEpisode = linkEpisodeRepository.findById(linkEpisodeId).orElseThrow(() -> new AppException(ErrorCode.LINKEPISODENOTFOUND));
        return linkEpisode;
    }
    public LinkEpisode updateLinkEpisode(LinkEpisodeRequest request, String linkEpisodeId) {
        LinkEpisode linkEpisode = linkEpisodeRepository.findById(linkEpisodeId).orElseThrow(() -> new AppException(ErrorCode.LINKEPISODENOTFOUND));
        linkEpisodeMapper.updateLinkEpisode(linkEpisode, request);
        return linkEpisodeRepository.save(linkEpisode);
    }
    public void deleteLinkEpisode(String linkEpisodeId) {
        LinkEpisode linkEpisode = linkEpisodeRepository.findById(linkEpisodeId).orElseThrow(() -> new AppException(ErrorCode.LINKEPISODENOTFOUND));
        linkEpisodeRepository.delete(linkEpisode);
    }
}
