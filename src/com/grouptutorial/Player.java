package com.grouptutorial;

import java.util.Scanner;

public class Player {
    Scanner input;
    String playerName;
    int playerAge;
    int playerType;
    int statistics;

    //To set Player's attributes
    public Player() {
        input = new Scanner(System.in);
        System.out.print("Player Name: ");
        playerName = input.next();
        System.out.print("Player Age: ");
        playerAge = input.nextInt();
        System.out.println("Spin Bowler -> 1");
        System.out.println("Seam Bowler -> 2");
        System.out.println("Batsman -> 3");
        System.out.println("Keeper -> 4");
        System.out.print("Select Player Type : ");
        playerType = input.nextInt();
        System.out.print("Total Runs or Wickets : ");
        statistics = input.nextInt();
    }

    public void getPlayerDetails()
    {
        System.out.println("Name: " + playerName);
        System.out.println("Age: " + playerAge);
        getPlayerType(playerType);
        System.out.println("Statistics: " + statistics);
    }

    public void getScoreAverages()
    {
        System.out.println("Name: " + playerName);
        getPlayerType(playerType);
        System.out.println("Average: " + statistics/15);
    }

    /*public void getBestPerformance()
    {

    }*/

    public void getPlayerType(int type)
    {
        switch (type) {

            case 1:
                System.out.println("Player Type : Spin Bowler");
                break;

            case 2:
                System.out.println("Player Type : Seam Bowler");
                break;

            case 3:
                System.out.println("Player Type : Batsman");
                break;

            case 4:
                System.out.println("Player Type : Keeper");
                break;
        }

    }
}
