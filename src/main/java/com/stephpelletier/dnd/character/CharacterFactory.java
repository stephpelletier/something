package com.stephpelletier.dnd.character;

public class CharacterFactory  {
    public Character createCharacter(String characterClass) throws Exception {
        switch (characterClass){
            case "Barbarian": return new Barbarian();
            case "Bard": return new Bard();
            case "Cleric": return new Cleric();
            case "Druid": return new Druid();
            case "Fighter": return new Druid();
            case "Monk": return new Monk();
            case "Paladin": return new Paladin();
            case "Ranger": return new Ranger();
            case "Rogue": return new Rogue();
            case "Sorcerer": return new Sorcerer();
            case "Warlock": return new Warlock();
            case "Wizard": return new Wizard();
            default: throw new Exception();
        }
    }
}
