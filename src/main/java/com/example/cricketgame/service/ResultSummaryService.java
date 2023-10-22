package com.example.cricketgame.service;

import com.example.cricketgame.model.ResultSummaryModel;

import java.util.Collection;

public interface ResultSummaryService {
    public ResultSummaryModel recordResultSummary(ResultSummaryModel resultSummaryModel);

    public Collection<ResultSummaryModel> getScoreCard(Integer matchsDbId);
}
