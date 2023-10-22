package com.example.cricketgame.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "SCOREBOARD")
public class ScoreBoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCOREBOARD_DB_ID")
    private Integer scoreBoardId;

    @Column(name = "BATTING_TEAM_CODE")
    private String battingTeamCode;

    @Column(name = "TEAM_SCORE")
    private Integer teamScore;

    @Column(name = "WICKETS")
    private Integer wickets;

    @Column(name = "STRICKER")
    private String striker;

    @Column(name = "STRICKER_SCORE")
    private Integer strikerScore;

    @Column(name = "BALLS_CONS_BY_STRICKER")
    private Integer ballsConsByStriker;

    @Column(name = "NON_STRICKER")
    private String nonStriker;

    @Column(name = "NON_STRICKER_SCORE")
    private Integer nonStrikerScore;

    @Column(name = "BALLS_CONS_BY_NON_STRICKER")
    private Integer ballsConsByNonStriker;

    @Column(name = "BOWLING_TEAM_CODE")
    private String bowlingTeamCode;

    @Column(name ="OVERS")
    private Float overs;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=".repeat(135));
        builder.append("\n");
        builder.append(battingTeamCode);
        builder.append("  ");
        builder.append(teamScore);
        builder.append("-");
        builder.append(wickets);
        builder.append("\t");
        builder.append(striker);
        builder.append(" " + strikerScore);
        builder.append("(");
        builder.append(ballsConsByStriker);
        builder.append(")*");
        builder.append("\t".repeat(2));
        builder.append(nonStriker);
        builder.append(" " + nonStrikerScore);
        builder.append("(");
        builder.append(ballsConsByNonStriker);
        builder.append(")");
        builder.append("\t".repeat(8));

        builder.append(" Overs - ");
        builder.append(String.format("%.1f", overs));
        builder.append("(");
        builder.append(bowlingTeamCode);
        builder.append(")");
        builder.append("\n");
        builder.append("=".repeat(135));
        return builder.toString();
    }
}
