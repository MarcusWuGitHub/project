package com.poc.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.conference.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
