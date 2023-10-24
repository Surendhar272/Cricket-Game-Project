package com.example.cricketgame.service;

import com.example.cricketgame.model.PlayerModel;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface PlayerService {
   public Collection<PlayerModel> getPlayersByTeamCode(String teamCode);

    public Collection<PlayerModel> getAllPlayers();
}
