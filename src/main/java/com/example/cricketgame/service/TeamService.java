package com.example.cricketgame.service;

import com.example.cricketgame.entity.TeamEntity;
import com.example.cricketgame.model.TeamModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {

    public TeamEntity getTeamEntityById(Integer teamId);
    public TeamModel getTeamEntityByCode(String teamCode);
}
