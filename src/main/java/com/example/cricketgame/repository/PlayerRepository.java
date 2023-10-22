package com.example.cricketgame.repository;


import com.example.cricketgame.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

    @Query("SELECT p FROM PlayerEntity p WHERE p.teamId.teamCode = :teamCode")
    Collection<PlayerEntity> getPlayersByTeamCode(String teamCode);

}
