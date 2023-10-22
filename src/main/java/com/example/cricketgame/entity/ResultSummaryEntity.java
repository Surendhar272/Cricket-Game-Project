package com.example.cricketgame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ResultSummaryEntity {
    @Id
    @GeneratedValue
    private Integer resultSummaryId;
    private Integer scoreBoardId;
    private MatchEntity matchId;
    private TeamEntity teamId;
    private PlayerEntity playerId;
    private Integer score;
}
