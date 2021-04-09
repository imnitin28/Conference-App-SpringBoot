package com.knoldus.repository;

import com.knoldus.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Nitin");
        speaker.setLastName("Mishra");

        speakers.add(speaker);

        return speakers;
    }
}
