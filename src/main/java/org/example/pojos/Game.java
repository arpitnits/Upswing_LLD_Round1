package org.example.pojos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    //team1 -> <player1, player2>  <player3, player4>

    Map<Integer, Team> teamMap = new HashMap<>();
    Map<Integer, Player> playerMap = new HashMap<>();

    Game() {

    }

    public void score(Integer teamId, Integer playerId, Integer score) {

    }

    public void substitute(Integer existingPlayerId, Integer subsPlayerId, Integer teamId) {
        Team team = teamMap.get(teamId);
        List<Integer> players = team.getPlayers();

        Player existPlayer = playerMap.get(existingPlayerId);
        Player subsPlayer = playerMap.get(subsPlayerId);

        //add validation - teamId, state of exist player nd subPlayer
        if(existPlayer.isPlaying())  {
            existPlayer.setPlaying(false);
            subsPlayer.setPlaying(true);
        }


        playerMap.put(existingPlayerId, existPlayer);
        playerMap.put(subsPlayerId, subsPlayer);
    }

    /**
     * playerId=:id and playerState=true
     *
     * playerId=:id and playerState=false
     */

    //A->C
    //A->D
}
