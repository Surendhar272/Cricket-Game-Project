package com.example.cricketgame.repository;

import com.example.cricketgame.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, Integer> {
}
