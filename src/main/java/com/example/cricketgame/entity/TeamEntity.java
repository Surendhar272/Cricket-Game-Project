package com.example.cricketgame.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TEAM")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_DB_ID")
    private Integer teamId;

    @Column(name = "TEAM_CODE")
    private String teamCode;

    @Column(name = "TEAM_NAME")
    private String teamName;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TeamEntity [teamDbId=");
        builder.append(teamId);
        builder.append(", teamCode=");
        builder.append(teamCode);
        builder.append(", teamName=");
        builder.append(teamName);
        builder.append("]");
        return builder.toString();
    }
}
