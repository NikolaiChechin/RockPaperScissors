package com.chechin;

/**
 * Created by chechin on 31.08.2016.
 */
public enum Player {
    PLAYER_A {
        @Override
        public Move getMove() {
            return Move.PAPER;
        }
    },
    PLAYER_B {
        @Override
        public Move getMove() {
            return Move.getRandomMove();
        }
    };

    public abstract Move getMove();
}
