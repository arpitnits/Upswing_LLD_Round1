package org.example.pojos;

import java.util.List;

public class Team {

    private Integer teamId;
    private Integer teamScore;

    public List<Integer> getPlayers() {
        return players;
    }

    public void setPlayers(List<Integer> players) {
        this.players = players;
    }

    private List<Integer> players;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}
