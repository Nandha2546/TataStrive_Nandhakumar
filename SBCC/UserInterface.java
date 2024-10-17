package SBCC;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = null;  

        while (true) {
            System.out.println("1. Create Player");
            System.out.println("2. Display Player Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter the player Id:");
                    String playerId = sc.nextLine();
                    System.out.println("Enter the player name:");
                    String playerName = sc.nextLine();
                    System.out.println("Enter the number of matches played:");
                    int matchesPlayed = sc.nextInt();
                    System.out.println("Enter the total runs scored:");
                    int runScored = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Enter the playing zone:");
                    String playingZone = sc.nextLine();
                    player = new Player(playerId, playerName, matchesPlayed, runScored, playingZone);
                    System.out.println("Player created successfully!");
                    break;

                case 2:
                    if (player != null) {
                        System.out.println("Player id: " + player.getPlayerId());
                        System.out.println("Player name: " + player.getPlayerName());
                        System.out.println("Matches played: " + player.getMatchesPlayed());
                        System.out.println("Total runs scored: " + player.getRunScored());
                        System.out.println("Playing zone: " + player.getPlayingZone());
                    } else {
                        System.out.println("No player has been created yet!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using SBCC Application...");
                    sc.close();
                    return; 

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
