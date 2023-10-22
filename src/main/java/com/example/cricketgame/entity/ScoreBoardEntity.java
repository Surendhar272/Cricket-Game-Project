package com.example.cricketgame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ScoreBoardEntity {

    @Id
    private Integer scoreBoardId;

    private String battingTeamCode;

    private Integer teamScore;

    private Integer wickets;

    private String striker;

    private Integer strikerScore;

    private Integer ballsConsByStriker;

    private String nonStriker;

    private Integer nonStrikerScore;

    private Integer ballsConsByNonStriker;

    private String bowlingTeamCode;

    private Float overs;
}
