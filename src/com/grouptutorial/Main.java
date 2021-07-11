package com.grouptutorial;

import javax.swing.plaf.metal.MetalBorders;
import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        int exit= -1;
        PlayerSelection playerSelection = new PlayerSelection();
        Scanner  input = new Scanner(System.in);
        String option, option2;
        do{
            System.out.println("Add Player -> A ");
            System.out.println("View All Players -> V ");
            System.out.println("To Exit-> 0 ");
            System.out.print("Enter Your Option : ");
            option = input.next();
            switch (option) {

                case "A":
                    playerSelection.AddPlayer();
                    System.out.println("Player Added.....");
                    break;

                case "V":
                    System.out.println("All Players' Details -> 1");
                    System.out.println("Best Two Bowlers -> 2");
                    System.out.println("Best Two Batsmen -> 3");
                    System.out.println("Best Keeper -> 4");
                    System.out.print("Enter Your Option : ");
                    option2 = input.next();
                    switch (option2) {
                        case "1":
                            playerSelection.DisplayAllPlayers();
                            break;
                        case "2":
                            playerSelection.DisplayBestBowlers();
                            break;
                        case "3":
                            playerSelection.DisplayBestBatsmen();
                            break;
                        case "4":
                            playerSelection.DisplayBestKeeper();
                            break;
                    }
                    break;

                case "0":
                    System.exit(0);
                    break;
            }

        }while(exit != 0);

    }
}
