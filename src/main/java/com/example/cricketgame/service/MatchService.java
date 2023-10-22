package com.example.cricketgame.service;

import com.example.cricketgame.entity.MatchEntity;
import com.example.cricketgame.model.MatchModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {
    MatchModel startMatch(MatchModel matchsModel);

    public List<MatchEntity> getAllMatchs();

    public MatchEntity getMatch(Integer matchId) ;

    public void addMatch(MatchEntity match) ;

    public void updateMatch(Integer id, MatchEntity matchentity) ;

    public void deleteMatch(Integer id);
}
