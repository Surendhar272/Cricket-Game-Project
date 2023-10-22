package com.example.cricketgame.controller;

import com.example.cricketgame.entity.MatchEntity;
import com.example.cricketgame.entity.TeamEntity;
import com.example.cricketgame.model.MatchModel;
import com.example.cricketgame.model.PlayerModel;
import com.example.cricketgame.model.ResultSummaryModel;
import com.example.cricketgame.model.TeamModel;
import com.example.cricketgame.service.MatchService;
import com.example.cricketgame.service.PlayerService;
import com.example.cricketgame.service.ResultSummaryService;
import com.example.cricketgame.service.TeamService;
import com.example.cricketgame.utils.CricketUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
public class MatchController {

    private TeamService teamService;

    private PlayerService playerService;

    private MatchService matchService;

    private ResultSummaryService resultSummaryService;

    private CricketUtils cricketUtils;

    @Autowired
    public MatchController(TeamService teamService, PlayerService playerService, MatchService matchService, ResultSummaryService resultSummaryService, CricketUtils cricketUtils) {
        this.teamService = teamService;
        this.playerService = playerService;
        this.matchService = matchService;
        this.resultSummaryService = resultSummaryService;
        this.cricketUtils = cricketUtils;
    }

    @GetMapping(value = "/team/{teamCode}")
    public TeamModel getTeamByCode(@PathVariable String teamCode) {
        return teamService.getTeamEntityByCode(teamCode);
    }

    @GetMapping(value = "/player")
    public Collection<PlayerModel> getPlayersByTeamId(@RequestParam Map<String, String> request) {
        return playerService.getPlayersByTeamCode(request.get("teamCode"));
    }

    @PostMapping(value = "/startMatch")
    public MatchModel startMatch(@RequestBody MatchModel matchModel) {
        return matchService.startMatch(matchModel);
    }

    @PostMapping(value = "/postSummary")
    public ResultSummaryModel postSummary(@RequestBody ResultSummaryModel resultSummaryModel) {
        return resultSummaryService.recordMatchsSummary(resultSummaryModel);
    }

    @GetMapping(value = "/getScoreCard/{matchsDbId}")
    public Collection<MatchsSummaryModel> getScoreCard(@PathVariable Integer matchsDbId) {
        return matchsSummaryService.getScoreCard(matchsDbId);
    }

    @PutMapping(value = "/playMatch")
    public void playMatch() {
        cricketUtils.playMatch();
    }


}
