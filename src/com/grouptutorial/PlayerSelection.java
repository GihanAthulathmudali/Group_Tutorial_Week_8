package com.grouptutorial;

import java.util.ArrayList;
import java.util.Comparator;

public class PlayerSelection {

    ArrayList<Player> playersList = new ArrayList<Player>();

    ArrayList<Player> playersListSpe = new ArrayList<Player>();
    public void AddPlayer(){
        Player player = new Player();
        playersList.add(player);
    }

    public void DisplayAllPlayers()
    {
        for(Player player :playersList)
        {
            player.getPlayerDetails();
            player.getScoreAverages();
        }
    }

    public void DisplayBestKeeper()
    {
        //Adding only keepers
        for(Player player :playersList)
        {
            if(player.playerType == 4) {
                playersListSpe.add(player);
            }
        }
        if(!playersListSpe.isEmpty()) {
            playersListSpe.sort(Comparator.comparing(player -> player.statistics));
            var bestKeeper = playersListSpe.get(playersListSpe.size()-1);
            bestKeeper.getPlayerDetails();
            bestKeeper.getScoreAverages();
        }
        else
        {
            System.out.println("No records founded..");
        }
    }

    public void DisplayBestBowlers()
    {
        //Adding only keepers
        for(Player player :playersList)
        {
            if(player.playerType == 1 || player.playerType == 2 ) {
                playersListSpe.add(player);
            }
        }
        if(!playersListSpe.isEmpty()) {
            playersListSpe.sort(Comparator.comparing(player -> player.statistics));

            var BowlerRankOne = playersListSpe.get(playersListSpe.size()-1);
            BowlerRankOne.getPlayerDetails();
            BowlerRankOne.getScoreAverages();
            var BowlerRankTwo = playersListSpe.get(playersListSpe.size()-2);
            BowlerRankTwo.getPlayerDetails();
            BowlerRankTwo.getScoreAverages();
        }
        else
        {
            System.out.println("No records founded..");
        }
    }

    public void DisplayBestBatsmen()
    {
        //Adding only keepers
        for(Player player :playersList)
        {
            if(player.playerType == 3) {
                playersListSpe.add(player);
            }
        }
        if(!playersListSpe.isEmpty()) {
            playersListSpe.sort(Comparator.comparing(player -> player.statistics));

            var RankOne = playersListSpe.get(playersListSpe.size() - 1);
            RankOne.getPlayerDetails();
            RankOne.getScoreAverages();
            var RankTwo = playersListSpe.get(playersListSpe.size() - 2);
            RankTwo.getPlayerDetails();
            RankTwo.getScoreAverages();
        }
        else
        {
            System.out.println("No records founded..");
        }
    }
}
