package com.chechin;

import java.util.Random;

/**
 * Created by chechin on 31.08.2016.
 */
public class GameRunner {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int playerAWinCount = 0;
        int playerBWinCount = 0;
        int tieCount = 0;
        for (int i = 0; i < 100; i++) {
            Move playerAMove = Move.PAPER;
            Move playerBMove = Move.valueOf(random.nextInt(3));
            Game game = new Game(playerAMove, playerBMove);
            Player winner = game.getWinner();
            if (winner == null) {
                tieCount++;
            } else if (winner == Player.PLAYER_A) {
                playerAWinCount++;
            } else if (winner == Player.PLAYER_B) {
                playerBWinCount++;
            }
        }
        System.out.println("Player A wins " + playerAWinCount + " of 100 games");
        System.out.println("Player B wins " + playerBWinCount + " of 100 games");
        System.out.println("Tie: " + tieCount + " of 100 games");
    }
}
