package com.knoldus.repository;

import com.knoldus.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
