package com.poc.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.conference.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
