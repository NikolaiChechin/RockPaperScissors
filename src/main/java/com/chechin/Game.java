package com.chechin;

/**
 * Created by chechin on 31.08.2016.
 */
public class Game {
    Move playerAMove;
    Move playerBMove;

    public Game(Move playerAMove, Move playerBMove) {
        this.playerAMove = playerAMove;
        this.playerBMove = playerBMove;
    }

    /**
     * Returns game winner. If it returns null it means tie
     * @return
     */
    public Player getWinner() {
        if (playerAMove == Move.SCISSORS && playerBMove == Move.PAPER) {
            return Player.PLAYER_A;
        } else if (playerAMove == Move.SCISSORS && playerBMove == Move.ROCK) {
            return Player.PLAYER_B;
        } else if (playerAMove == Move.PAPER && playerBMove == Move.ROCK) {
            return Player.PLAYER_A;
        } else if (playerAMove == Move.PAPER && playerBMove == Move.SCISSORS) {
            return Player.PLAYER_B;
        } else if (playerAMove == Move.ROCK && playerBMove == Move.SCISSORS) {
            return Player.PLAYER_A;
        } else if (playerAMove == Move.ROCK && playerBMove == Move.PAPER) {
            return Player.PLAYER_B;
        } else {
            return null;
        }
    }
}
