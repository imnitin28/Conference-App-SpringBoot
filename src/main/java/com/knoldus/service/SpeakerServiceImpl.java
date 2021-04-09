package com.knoldus.service;

import com.knoldus.model.Speaker;
import com.knoldus.repository.HibernateSpeakerRepositoryImpl;
import com.knoldus.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    public List<Speaker>  findAll() {
        return repository.findAll();
    }
}
