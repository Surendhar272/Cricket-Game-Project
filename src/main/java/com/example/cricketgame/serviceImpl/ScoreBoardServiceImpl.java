package com.example.cricketgame.serviceImpl;

import com.example.cricketgame.entity.ScoreBoardEntity;
import com.example.cricketgame.model.ScoreBoardModel;
import com.example.cricketgame.repository.ScoreBoardRepository;
import com.example.cricketgame.service.ScoreBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class ScoreBoardServiceImpl implements ScoreBoardService {

    private final ScoreBoardRepository scoreBoardRepository;

    @Autowired
    public ScoreBoardServiceImpl(ScoreBoardRepository scoreBoardRepository) {
        this.scoreBoardRepository = scoreBoardRepository;
    }
    @Override
    public ScoreBoardModel recordScoreBoard(ScoreBoardModel scoreBoardModel) {

        ScoreBoardEntity scoreBoardEntity = new ScoreBoardEntity();

        scoreBoardEntity.setScoreBoardId(scoreBoardModel.getScoreBoardId());
        scoreBoardEntity.setBattingTeamCode(scoreBoardModel.getBattingTeamCode());
        scoreBoardEntity.setTeamScore(scoreBoardModel.getTeamScore());
        scoreBoardEntity.setWickets(scoreBoardModel.getWickets());
        scoreBoardEntity.setStriker(scoreBoardModel.getStriker());
        scoreBoardEntity.setStrikerScore(scoreBoardModel.getStrikerScore());
        scoreBoardEntity.setBallsConsByStriker(scoreBoardModel.getBallsConsByNonStriker());
        scoreBoardEntity.setNonStriker(scoreBoardModel.getNonStriker());
        scoreBoardEntity.setNonStrikerScore(scoreBoardModel.getNonStrikerScore());
        scoreBoardEntity.setBallsConsByNonStriker(scoreBoardModel.getBallsConsByNonStriker());
        scoreBoardEntity.setBowlingTeamCode(scoreBoardModel.getBowlingTeamCode());
        scoreBoardEntity.setOvers(scoreBoardModel.getOvers());

        ScoreBoardEntity responseEntity = scoreBoardRepository.save(scoreBoardEntity);

        ScoreBoardModel responseModel = new ScoreBoardModel();

        responseModel.setScoreBoardId(responseEntity.getScoreBoardId());
        responseModel.setBattingTeamCode(responseEntity.getBattingTeamCode());
        responseModel.setTeamScore(responseEntity.getTeamScore());
        responseModel.setWickets(responseEntity.getWickets());
        responseModel.setStriker(responseEntity.getStriker());
        responseModel.setStrikerScore(responseEntity.getStrikerScore());
        responseModel.setBallsConsByStriker(responseEntity.getBallsConsByNonStriker());
        responseModel.setNonStriker(responseEntity.getNonStriker());
        responseModel.setNonStrikerScore(responseEntity.getNonStrikerScore());
        responseModel.setBallsConsByNonStriker(responseEntity.getBallsConsByNonStriker());
        responseModel.setBowlingTeamCode(responseEntity.getBowlingTeamCode());
        responseModel.setOvers(responseEntity.getOvers());
        return responseModel;
    }

    @Override
    public Collection<ScoreBoardModel> getScoreBoard(Integer scoreBoardId) {
        Collection<ScoreBoardModel> responseModels = new ArrayList<ScoreBoardModel>();

        Collection<ScoreBoardEntity> responseEntitys = scoreBoardRepository.getScoreCard(scoreBoardId);

        for(ScoreBoardEntity responseEntity :responseEntitys) {
            ScoreBoardModel responseModel = new ScoreBoardModel();
            responseModel.setScoreBoardId(responseEntity.getScoreBoardId());
            responseModel.setBattingTeamCode(responseEntity.getBattingTeamCode());
            responseModel.setTeamScore(responseEntity.getTeamScore());
            responseModel.setWickets(responseEntity.getWickets());
            responseModel.setStriker(responseEntity.getStriker());
            responseModel.setStrikerScore(responseEntity.getStrikerScore());
            responseModel.setBallsConsByStriker(responseEntity.getBallsConsByNonStriker());
            responseModel.setNonStriker(responseEntity.getNonStriker());
            responseModel.setNonStrikerScore(responseEntity.getNonStrikerScore());
            responseModel.setBallsConsByNonStriker(responseEntity.getBallsConsByNonStriker());
            responseModel.setBowlingTeamCode(responseEntity.getBowlingTeamCode());
            responseModel.setOvers(responseEntity.getOvers());
            responseModels.add(responseModel);
        }
        return responseModels;
    }
}
