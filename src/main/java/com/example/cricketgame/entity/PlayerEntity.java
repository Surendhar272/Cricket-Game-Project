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
@Table(name = "PLAYER")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYER_DB_ID")
    private int playerId;

    @ManyToOne
    @JoinColumn(name = "TEAM_DB_ID", updatable=false)
    private TeamEntity teamId;

    @Column(name = "PLAYER_NAME")
    private String playerName;
}
