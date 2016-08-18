package com.stephpelletier.dnd.character;

public abstract class Character {
    private Ability strength;
    private Ability dexterity;
    private Ability intelligence;
    private Ability constitution;
    private Ability wisdom;
    private Ability charisma;

    public Character() {
        strength = new Ability();
        dexterity = new Ability();
        intelligence = new Ability();
        constitution = new Ability();
        wisdom = new Ability();
        charisma = new Ability();
    }

    public int getCharismaScore() {
        return this.charisma.getScore();
    }

    public int getCharismaModifier(){return this.charisma.getModifier();}

    public int getStrengthScore() {
        return this.strength.getScore();
    }

    public int getStrengthModifier(){return this.strength.getModifier();}

    public int getDexterityScore() {
        return this.dexterity.getScore();
    }

    public int getDexterityModifier(){return this.dexterity.getModifier();}

    public int getIntelligenceScore() {return this.intelligence.getScore();}

    public int getIntelligenceModifier(){return this.intelligence.getModifier();}

    public int getConstitutionScore() {
        return this.constitution.getScore();
    }

    public int getConstitutionModifier(){return this.constitution.getModifier();}

    public int getWisdomScore() {return this.wisdom.getScore();}

    public int getWisdomModifier(){return this.wisdom.getModifier();}

    public abstract String getCharacterClass();
}
