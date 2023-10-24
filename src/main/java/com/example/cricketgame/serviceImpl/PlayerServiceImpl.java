package com.example.cricketgame.serviceImpl;

import com.example.cricketgame.entity.PlayerEntity;
import com.example.cricketgame.model.PlayerModel;
import com.example.cricketgame.repository.PlayerRepository;
import com.example.cricketgame.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    @Override
    public Collection<PlayerModel> getPlayersByTeamCode(String teamCode) {
        Collection<PlayerModel> playerModels = new ArrayList<>();
        for(PlayerEntity playerEntity : playerRepository.getPlayersByTeamCode(teamCode)) {
            PlayerModel playerModel = new PlayerModel();
            playerModel.setPlayerId(playerEntity.getPlayerId());
            playerModel.setPlayerName(playerEntity.getPlayerName());
            playerModel.setTeamId(playerEntity.getTeamId());
            playerModels.add(playerModel);
        }
        return playerModels;
    }

    @Override
    public Collection<PlayerModel> getAllPlayers() {
        Collection<PlayerModel> responseModels = new ArrayList<PlayerModel>();

        Collection<PlayerEntity> playerEntities = playerRepository.findAll();

        for(PlayerEntity responseEntity :playerEntities) {
            PlayerModel responseModel = new PlayerModel();
            responseModel.setPlayerId(responseEntity.getPlayerId());
            responseModel.setTeamId(responseEntity.getTeamId());
            responseModel.setPlayerName(responseEntity.getPlayerName());
            responseModels.add(responseModel);
        }
        return responseModels;
    }
}
