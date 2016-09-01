package com.chechin;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by chechin on 31.08.2016.
 */
public enum Move {

    ROCK,
    PAPER,
    SCISSORS;

    private static Map<Integer, Move> moveMap = new HashMap<>();

    static {
        moveMap.put(0, ROCK);
        moveMap.put(1, PAPER);
        moveMap.put(2, SCISSORS);
    }

    private static final Random random = new Random();

    private static Move valueOf(Integer moveNum){
        return moveMap.get(moveNum);
    }

    public static Move getRandomMove(){
        return valueOf(random.nextInt(3));
    }
}
