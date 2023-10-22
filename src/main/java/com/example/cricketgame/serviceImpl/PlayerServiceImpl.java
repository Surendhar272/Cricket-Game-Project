package com.example.cricketgame.serviceImpl;

import com.example.cricketgame.model.PlayerModel;
import com.example.cricketgame.service.PlayerService;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class PlayerServiceImpl implements PlayerService {
    @Override
    public Collection<PlayerModel> getPlayersByTeamCode(String teamCode) {
        return null;
    }
}
