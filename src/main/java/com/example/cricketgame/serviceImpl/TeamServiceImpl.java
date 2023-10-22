package com.example.cricketgame.serviceImpl;

import com.example.cricketgame.cricket_db_collections.TeamDBList;
import com.example.cricketgame.entity.TeamEntity;
import com.example.cricketgame.model.TeamModel;
import com.example.cricketgame.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDBList teamDBList;
    @Override
    public TeamEntity getTeamEntityById(Integer teamId) {
        return teamDBList.getTeamEntityList().get(teamId);
    }

    @Override
    public TeamModel getTeamEntityByCode(String teamCode) {
        // Assuming teamDBList is an instance of a class that contains a List of TeamModel objects
        List<TeamEntity> teamEntityList = teamDBList.getTeamEntityList();

        // Use a stream to filter the list based on the team code and return the first matching item
        return teamEntityList.stream()
                .filter(team -> teamCode.equals(team.getTeamCode())) // Assuming TeamModel has a 'getTeamCode' method
                .findFirst() // Get the first matching item, if any
                .orElse(null); // Return null if no match is found
    }
//
//    @Autowired
//    private TeamDBList teamDBList;
//
//    @Override
//    public List<TeamEntity> getAllTeams() {
//        return teamDBList.getTeamEntityList();
//    }
//
//    @Override
//    public TeamEntity getTeam(Integer teamId) {
//        return teamDBList.getTeamEntityList().get(teamId);
//    }
//
//    @Override
//    public void addTeam(TeamEntity teamEntity) {
//        teamDBList.getTeamEntityList().add(teamEntity);
//    }
//
//    @Override
//    public void updateTeam(Integer id, TeamEntity teamEntity) {
//
//        // Use stream to find the team with the specified id
//        teamDBList.getTeamEntityList().stream().filter(t->t.getTeamId().equals(id)).findFirst().ifPresent(team ->
//        {
//            team.setTeamCode(teamEntity.getTeamCode());
//        });
//    }
//
//    @Override
//    public void deleteTeam(Integer id) {
//        teamDBList.getTeamEntityList().removeIf(t->t.getTeamId().equals(id));
//    }

}
