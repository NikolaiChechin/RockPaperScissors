package com.chechin;

import java.util.HashMap;
import java.util.Map;

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

    public static Move valueOf(Integer moveNum){
        return moveMap.get(moveNum);
    }
}
