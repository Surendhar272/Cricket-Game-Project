package com.example.cricketgame.controller;

import com.example.cricketgame.model.*;
import com.example.cricketgame.service.*;
import com.example.cricketgame.utils.CricketUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RestController
public class MatchController {

    private final TeamService teamService;

    private final PlayerService playerService;

    private final MatchService matchService;

    private final ResultSummaryService resultSummaryService;

    private final ScoreBoardService scoreBoardService;

    private final CricketUtils cricketUtils;

    @Autowired
    public MatchController(TeamService teamService, PlayerService playerService, MatchService matchService, ResultSummaryService resultSummaryService, ScoreBoardService scoreBoardService, CricketUtils cricketUtils) {
        this.teamService = teamService;
        this.playerService = playerService;
        this.matchService = matchService;
        this.resultSummaryService = resultSummaryService;
        this.scoreBoardService = scoreBoardService;
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

    @GetMapping(value = "/fetch/players")
    public Collection<PlayerModel> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping(value = "/startMatch")
    public MatchModel startMatch(@RequestBody MatchModel matchsModel) {
        return matchService.startMatch(matchsModel);
    }

    @PostMapping(value = "/postSummary")
    public ResultSummaryModel postSummary(@RequestBody ResultSummaryModel resultSummaryModel) {
        return resultSummaryService.recordResultSummary(resultSummaryModel);
    }

    @PostMapping(value = "/postScoreBoard")
    public ScoreBoardModel postSummary(@RequestBody ScoreBoardModel resultSummaryModel) {
        return scoreBoardService.recordScoreBoard(resultSummaryModel);
    }
    @GetMapping(value = "/getScoreCard/{matchId}")
    public Collection<ResultSummaryModel> getScoreCard(@PathVariable Integer matchId) {
        return resultSummaryService.getScoreCard(matchId);
    }

    @GetMapping(value = "/getScoreBoard")
    public Collection<ScoreBoardModel> getScoreBoard() {
        return scoreBoardService.getScoreBoard();
    }

    @PutMapping(value = "/playMatch")
    public void playMatch() {
        cricketUtils.playMatch();
    }

}
