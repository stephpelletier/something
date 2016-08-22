package com.stephpelletier.dnd.character;

/**
 * Created by stephane on 2016-08-15.
 */
import java.util.Random;

public class Ability {
    private int score;

    public Ability() {
        Random random = new Random();
        this.score = random.nextInt((18 - 4) + 1) + 4;
    }

    public int getScore() {
        return this.score;
    }

    public int getModifier() {
        return (int)Math.floor((this.score / 2) - 10);
    }
}
