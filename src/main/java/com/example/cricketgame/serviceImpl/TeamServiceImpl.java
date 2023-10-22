package com.example.cricketgame.serviceImpl;


import com.example.cricketgame.entity.TeamEntity;
import com.example.cricketgame.model.TeamModel;
import com.example.cricketgame.repository.TeamRepository;
import com.example.cricketgame.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    private TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public TeamEntity getTeamEntityById(Integer teamId) {
        return teamRepository.getReferenceById(teamId);
    }

    public TeamModel getTeamEntityByCode(String teamCode) {
        TeamEntity teamEntity = teamRepository.getTeamByCode(teamCode);
        TeamModel teamModel = new TeamModel();
        teamModel.setTeamId(teamEntity.getTeamId());
        teamModel.setTeamCode(teamEntity.getTeamCode());
        teamModel.setTeamName(teamEntity.getTeamName());
        return teamModel;
    }

}
