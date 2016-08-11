package com.stephpelletier.dnd.character;

import java.util.Random;

public abstract class Character {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int constitution;
    private int wisdom;
    private int charisma;

    public Character() {
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

    public int getCharisma() {
        return this.charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return this.constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public abstract String getCharacterClass();
}
