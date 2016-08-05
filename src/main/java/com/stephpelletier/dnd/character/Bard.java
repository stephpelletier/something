package com.stephpelletier.dnd.character;

import java.util.Random;

/**
 * Created by stephane on 2016-08-04.
 */
public class Bard implements Character{
    private int strength;
    private int dexterity;
    private int intelligence;
    private int constitution;
    private int wisdom;
    private int charisma;

    public Bard() {
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
        return this.charisma;
    }

    @Override
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public int getConstitution() {
        return this.constitution;
    }

    @Override
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    @Override
    public int getWisdom() {
        return this.wisdom;
    }

    @Override
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
}
