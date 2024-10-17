package lab;

import java.util.Random;

public class LotteryWinners {
    public static void main(String[] args) {
        Random random = new Random();
        int[] winners = new int[5];

        for (int i = 0; i < winners.length; i++) {
            winners[i] = random.nextInt(1000) + 1; // Generates numbers between 1 and 1000
        }

        System.out.println("Lottery winners: ");
        for (int winner : winners) {
            System.out.println(winner);
        }
    }
}

