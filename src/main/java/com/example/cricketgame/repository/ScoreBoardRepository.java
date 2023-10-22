package com.example.cricketgame.repository;

import com.example.cricketgame.entity.ResultSummaryEntity;
import com.example.cricketgame.entity.ScoreBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface ScoreBoardRepository extends JpaRepository<ScoreBoardEntity, Integer> {
    @Query("SELECT s FROM ScoreBoardEntity s WHERE s.scoreBoardId = :scoreBoardId")
    Collection<ScoreBoardEntity> getScoreCard(Integer scoreBoardId);
}
