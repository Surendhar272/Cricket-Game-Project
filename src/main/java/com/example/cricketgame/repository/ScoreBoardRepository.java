package com.example.cricketgame.repository;

import com.example.cricketgame.entity.ScoreBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreBoardRepository extends JpaRepository<ScoreBoardEntity, Integer> {
}
