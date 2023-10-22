package com.example.cricketgame.service;

import com.example.cricketgame.model.MatchModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {

    public MatchModel startMatch(MatchModel matchModel);
}
