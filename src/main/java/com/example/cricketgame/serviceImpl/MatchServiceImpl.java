package com.example.cricketgame.serviceImpl;

import com.example.cricketgame.cricket_db_collections.MatchList;
import com.example.cricketgame.cricket_db_collections.TeamDBList;
import com.example.cricketgame.entity.MatchEntity;
import com.example.cricketgame.model.MatchModel;
import com.example.cricketgame.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchList matchList;

    @Override
    public MatchModel startMatch(MatchModel matchModel) {
        matchList.getMatchRegisted().add(matchModel);
        return matchModel;
    }

    public List<MatchEntity> getAllMatchs(){
        return matchList.getMatchRegisted();
    }

    public MatchEntity getMatch(Integer matchId) {
        return matchList.getMatchRegisted().stream().filter(t-> t.getMatchId().equals(matchId)).findFirst().get();
    }

    public void addMatch(MatchEntity match) {
        matchList.getMatchRegisted().add(match);
    }

    public void updateMatch(Integer id, MatchEntity matchentity) {
        for(int i=0;i<matchList.getMatchRegisted().size();i++){
            MatchEntity t = matchList.getMatchRegisted().get(i);
            if(t.getMatchId().equals(id)){
                matchList.getMatchRegisted().set(i,matchentity);
                return;
            }
        }
    }

    public void deleteMatch(Integer id) {
        matchList.getMatchRegisted().removeIf(t-> t.getMatchId().equals(id));
    }



}
