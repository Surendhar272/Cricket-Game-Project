package com.example.cricketgame.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "MATCHS")
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MATCHS_DB_ID")
    private Integer matchsDbId;

    @ManyToOne
    @JoinColumn(name="TEAM1_DB_ID", updatable=false)
    private TeamEntity team1;

    @ManyToOne
    @JoinColumn(name="TEAM2_DB_ID", updatable=false)
    private TeamEntity team2;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MatchsEntity [matchsDbId=");
        builder.append(matchsDbId);
        builder.append(", team1=");
        builder.append(team1);
        builder.append(", team2=");
        builder.append(team2);
        builder.append("]");
        return builder.toString();
    }
}
