package com.chechin;

/**
 * Created by chechin on 31.08.2016.
 */
public class GameRunner {

    private int runCount;
    private int playerAWinCount;
    private int playerBWinCount;
    private int tieCount;
    private boolean gameFinished;

    public int getRunCount() {
        return runCount;
    }

    public void setRunCount(int runCount) {
        this.runCount = runCount;
    }

    public int getPlayerAWinCount() {
        if(gameFinished) {
            return playerAWinCount;
        } else {
            throw new IllegalStateException("The game is not finished yet!");
        }
    }

    public int getPlayerBWinCount() {
        if(gameFinished) {
            return playerBWinCount;
        } else {
            throw new IllegalStateException("The game is not finished yet!");
        }
    }

    public int getTieCount() {
        if(gameFinished) {
            return tieCount;
        } else {
            throw new IllegalStateException("The game is not finished yet!");
        }
    }

    public void runGame(){
        for (int i = 0; i < runCount; i++) {
            Move playerAMove = Player.PLAYER_A.getMove();
            Move playerBMove = Player.PLAYER_B.getMove();
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
        gameFinished = true;
    }

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner();
        gameRunner.setRunCount(100);
        gameRunner.runGame();
        int playerAWinCount = gameRunner.getPlayerAWinCount();
        int playerBWinCount = gameRunner.getPlayerBWinCount();
        int tieCount = gameRunner.getTieCount();
        System.out.println("Player A wins " + playerAWinCount + " of 100 games");
        System.out.println("Player B wins " + playerBWinCount + " of 100 games");
        System.out.println("Tie: " + tieCount + " of 100 games");
    }
}
