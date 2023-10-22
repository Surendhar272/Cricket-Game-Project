package com.example.cricketgame.repository;

import com.example.cricketgame.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
    @Query("SELECT t FROM TeamEntity t WHERE t.teamCode = :teamCode")
    TeamEntity getTeamByCode(String teamCode);
}
