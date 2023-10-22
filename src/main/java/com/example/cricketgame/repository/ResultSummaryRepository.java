package com.example.cricketgame.repository;

import com.example.cricketgame.entity.ResultSummaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface ResultSummaryRepository extends JpaRepository<ResultSummaryEntity, Integer> {
    @Query("SELECT s FROM ResultSummaryEntity s WHERE s.matchId.matchsDbId = :matchsDbId")
    Collection<ResultSummaryEntity> getScoreCard(Integer matchsDbId);
}
