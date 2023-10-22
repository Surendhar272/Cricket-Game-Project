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
public class TeamEntity {

    @Id
    @GeneratedValue
    private Integer teamId;
    private String teamCode;
    private String teamName;
    private Integer noOfPlayers;
}
