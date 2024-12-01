package com.Sonic.FilmProject.Service;

import com.Sonic.FilmProject.Entity.Description;
import com.Sonic.FilmProject.Exception.AppException;
import com.Sonic.FilmProject.Exception.ErrorCode;
import com.Sonic.FilmProject.Mapper.DescriptionMapper;
import com.Sonic.FilmProject.Repository.DescriptionRepository;
import com.Sonic.FilmProject.dto.Request.DescriptionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesciptionService {
    @Autowired
    private DescriptionRepository descriptionRepository;
    @Autowired
    private DescriptionMapper descriptionMapper;

    public Description createDescription(DescriptionRequest request) {
        if(descriptionRepository.existsBySlug(request.getSlug())) {
            throw new AppException(ErrorCode.SLUGDESCRIPTIONEXISTED);
        }
        Description description = new Description();
        descriptionMapper.toDescription(request);
        return descriptionRepository.save(description);
    }

    public List<Description> getAllDescriptions() {
        return descriptionRepository.findAll();
    }

    public Description getDescriptionBySlug(String slug) {
        Optional<Description> optionalDescription = descriptionRepository.findBySlug(slug);
        Description description = optionalDescription.orElseThrow(() -> new AppException(ErrorCode.SLUGDESCRIPTIONNOTFOUND));
        return description;
    }

    public Description updateDescriptionBySlug(String slug, DescriptionRequest request) {
        Optional<Description> optionalDescription = descriptionRepository.findBySlug(slug);
        Description description = optionalDescription.orElseThrow(() -> new AppException(ErrorCode.SLUGDESCRIPTIONNOTFOUND));
        descriptionMapper.updateDescription(description, request);
        return descriptionRepository.save(description);
    }

    public void deleteDescriptionBySlug(String slug) {
        Optional<Description> optionalDescription = descriptionRepository.findBySlug(slug);
        Description description = optionalDescription.orElseThrow(() -> new AppException(ErrorCode.SLUGDESCRIPTIONNOTFOUND));
        descriptionRepository.delete(description);
    }

    public void deleteDescriptionById(String id) {
        Description description = descriptionRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.SLUGDESCRIPTIONNOTFOUND));
        descriptionRepository.delete(description);
    }
}
