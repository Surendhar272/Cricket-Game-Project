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
public class PlayerEntity {
    @Id
    @GeneratedValue
    private int playerId;
    private TeamEntity teamId;
    private String playerName;
}
