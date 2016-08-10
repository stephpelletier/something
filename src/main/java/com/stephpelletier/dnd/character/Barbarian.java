package com.stephpelletier.dnd.character;

import java.util.Random;

public class Barbarian extends Character {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int constitution;
    private int wisdom;
    private int charisma;

    public Barbarian() {
        strength = generateStat();
        dexterity = generateStat();
        intelligence = generateStat();
        constitution = generateStat();
        wisdom = generateStat();
        charisma = generateStat();
    }

    protected int generateStat() {
        Random random = new Random();
        int stat = random.nextInt((18 - 4) + 1) + 4;
        return stat;
    }

    @Override
    public int getCharisma() {
        return 0;
    }

    @Override
    public void setCharisma(int charisma) {

    }

    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public void setStrength(int strength) {

    }

    @Override
    public int getDexterity() {
        return 0;
    }

    @Override
    public void setDexterity(int dexterity) {

    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
    public void setIntelligence(int intelligence) {

    }

    @Override
    public int getConstitution() {
        return 0;
    }

    @Override
    public void setConstitution(int constitution) {

    }

    @Override
    public int getWisdom() {
        return 0;
    }

    @Override
    public void setWisdom(int wisdom) {

    }
}
