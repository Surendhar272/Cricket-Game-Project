package com.example.cricketgame.serviceImpl;

import com.example.cricketgame.entity.ResultSummaryEntity;
import com.example.cricketgame.model.ResultSummaryModel;
import com.example.cricketgame.repository.ResultSummaryRepository;
import com.example.cricketgame.service.ResultSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class ResultSummaryServiceImpl implements ResultSummaryService {

    private final ResultSummaryRepository resultSummaryRepository;

    @Autowired
    public ResultSummaryServiceImpl(ResultSummaryRepository resultSummaryRepository) {
        this.resultSummaryRepository = resultSummaryRepository;
    }

    @Override
    public ResultSummaryModel recordResultSummary(ResultSummaryModel resultSummaryModel) {
        ResultSummaryEntity resultSummaryEntity = new ResultSummaryEntity();
        resultSummaryEntity.setResultSummaryId(resultSummaryModel.getResultSummaryId());
        resultSummaryEntity.setMatchId(resultSummaryModel.getMatchId());
        resultSummaryEntity.setTeamId(resultSummaryModel.getTeamId());
        resultSummaryEntity.setPlayerId(resultSummaryModel.getPlayerId());
        resultSummaryEntity.setScore(resultSummaryModel.getScore());
        resultSummaryEntity.setBallsConsumed(resultSummaryModel.getBallsConsumed());

        ResultSummaryEntity responseEntity = resultSummaryRepository.save(resultSummaryEntity);

        ResultSummaryModel responseModel = new ResultSummaryModel();
        responseModel.setResultSummaryId(responseEntity.getResultSummaryId());
        responseModel.setMatchId(responseEntity.getMatchId());
        responseModel.setTeamId(responseEntity.getTeamId());
        responseModel.setPlayerId(responseEntity.getPlayerId());
        responseModel.setScore(responseEntity.getScore());
        responseModel.setBallsConsumed(responseEntity.getBallsConsumed());
        return responseModel;
    }

    @Override
    public Collection<ResultSummaryModel> getScoreCard(Integer matchId) {
        Collection<ResultSummaryModel> responseModels = new ArrayList<ResultSummaryModel>();

        Collection<ResultSummaryEntity> responseEntitys = resultSummaryRepository.getScoreCard(matchId);

        for(ResultSummaryEntity responseEntity :responseEntitys) {
            ResultSummaryModel responseModel = new ResultSummaryModel();
            responseModel.setResultSummaryId(responseEntity.getResultSummaryId());
            responseModel.setMatchId(responseEntity.getMatchId());
            responseModel.setTeamId(responseEntity.getTeamId());
            responseModel.setPlayerId(responseEntity.getPlayerId());
            responseModel.setScore(responseEntity.getScore());
            responseModel.setBallsConsumed(responseEntity.getBallsConsumed());
            responseModels.add(responseModel);
        }
        return responseModels;
    }
}
