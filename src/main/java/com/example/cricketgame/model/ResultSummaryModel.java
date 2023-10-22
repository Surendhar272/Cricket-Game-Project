package com.example.cricketgame.model;

import com.example.cricketgame.entity.ResultSummaryEntity;
import com.example.cricketgame.service.ResultSummaryService;

public class ResultSummaryModel extends ResultSummaryEntity {
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("-".repeat(135));
        builder.append("\n");
        builder.append(getTeamId().getTeamCode());
        builder.append("\t".repeat(3));
        builder.append(getPlayerId().getPlayerName());
        builder.append("\t".repeat(3));
        builder.append(getScore());
        builder.append("(");
        builder.append(getBallsConsumed());
        builder.append(")");
        builder.append("\t".repeat(3));
        builder.append((getBallsConsumed()!=0)?getScore()*100.0f/getBallsConsumed() : 0);
        builder.append("\n");
        builder.append("-".repeat(135));
        return builder.toString();
    }
}
