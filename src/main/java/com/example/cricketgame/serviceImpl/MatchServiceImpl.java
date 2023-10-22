package com.example.cricketgame.serviceImpl;


import com.example.cricketgame.entity.MatchEntity;
import com.example.cricketgame.model.MatchModel;
import com.example.cricketgame.repository.MatchRepository;
import com.example.cricketgame.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchServiceImpl implements MatchService {

    private MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchsRepository) {
        this.matchRepository = matchsRepository;
    }
    @Override
    public MatchModel startMatch(MatchModel matchModel) {
        MatchEntity matchEntity = new MatchEntity();
        matchEntity.setTeam1(matchModel.getTeam1());
        matchEntity.setTeam2(matchModel.getTeam2());
        MatchEntity response = matchRepository.save(matchEntity);
        MatchModel responseModel = new MatchModel();
        responseModel.setMatchsDbId(response.getMatchsDbId());
        responseModel.setTeam1(response.getTeam1());
        responseModel.setTeam2(response.getTeam2());
        return responseModel;
    }
}
