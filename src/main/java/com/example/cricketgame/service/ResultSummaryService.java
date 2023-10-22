package com.example.cricketgame.service;

import com.example.cricketgame.model.ResultSummaryModel;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface ResultSummaryService {
    public ResultSummaryModel recordResultSummary(ResultSummaryModel resultSummaryModel);

    public Collection<ResultSummaryModel> getScoreCard(Integer matchsDbId);

}
