package com.example.cricketgame.service;

import com.example.cricketgame.entity.MatchEntity;
import com.example.cricketgame.model.MatchModel;
import com.example.cricketgame.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {

    public MatchModel startMatch(MatchModel matchModel);
}
