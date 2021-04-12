package com.knoldus.service;

import com.knoldus.model.Speaker;
import com.knoldus.repository.HibernateSpeakerRepositoryImpl;
import com.knoldus.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;
    //constructor injection - index
    public SpeakerServiceImpl() {

    }
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker>  findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
