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
public class MatchEntity {
    @Id
    @GeneratedValue
    private Integer matchId;
    private TeamEntity team1;
    private TeamEntity team2;
}
