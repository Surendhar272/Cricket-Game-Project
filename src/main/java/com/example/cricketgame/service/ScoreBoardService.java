package com.example.cricketgame.service;

import com.example.cricketgame.model.ResultSummaryModel;
import com.example.cricketgame.model.ScoreBoardModel;

import java.util.Collection;

public interface ScoreBoardService {


    public Collection<ScoreBoardModel> getScoreBoard(Integer scoreBoardId);
}
