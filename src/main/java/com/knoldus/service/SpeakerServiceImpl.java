package com.knoldus.service;

import com.knoldus.model.Speaker;
import com.knoldus.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository; //pain point -- hard coded -- eliminated in Spring
    public List<Speaker>  findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
