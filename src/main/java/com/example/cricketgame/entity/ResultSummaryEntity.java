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
@Table(name = "RESULTS_SUMMARY")
public class ResultSummaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESULT_SUMMARY_DB_ID")
    private Integer resultSummaryId;

    @ManyToOne
    @JoinColumn(name = "MATCHS_DB_ID")
    private MatchEntity matchId;

    @ManyToOne
    @JoinColumn(name = "TEAM_DB_ID")
    private TeamEntity teamId;

    @ManyToOne
    @JoinColumn(name = "PLAYER_DB_ID")
    private PlayerEntity playerId;

    @Column(name = "SCORE")
    private Integer score;

    @Column(name = "BALLS_CONSUMED")
    private Integer ballsConsumed;
}
