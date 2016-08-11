package com.stephpelletier.dnd.character;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CharacterFactoryTest  {
    
    private CharacterFactory characterFactory;

    @Before
    public void setup() {
        characterFactory = new CharacterFactory();
    }

    @Test
    public void givenABarbarianInputWhenCreatingCharacterThenOutputABarbarianClass() throws Exception {
        Character barbarian = characterFactory.createCharacter("Barbarian");
        assertTrue(barbarian instanceof Barbarian);
    }

    @Test
    public void givenABardInputWhenCreatingCharacterThenOutputABardClass() throws Exception {
        Character bard = characterFactory.createCharacter("Bard");
        assertTrue(bard instanceof Bard);
    }

    @Test
    public void givenAClericInputWhenCreatingCharacterThenOutputAClericClass() throws Exception {
        Character cleric = characterFactory.createCharacter("Cleric");
        assertTrue(cleric instanceof Cleric);
    }

    @Test
    public void givenADruidInputWhenCreatingCharacterThenOutputADruidClass() throws Exception {
        Character druid = characterFactory.createCharacter("Druid");
        assertTrue(druid instanceof Druid);
    }

    @Test
    public void givenAFighterInputWhenCreatingCharacterThenOutputAFighterClass() throws Exception {
        Character fighter = characterFactory.createCharacter("Fighter");
        assertTrue(fighter instanceof Fighter);
    }

    @Test
    public void givenAMonkInputWhenCreatingCharacterThenOutputAMonkClass() throws Exception {
        Character monk = characterFactory.createCharacter("Monk");
        assertTrue(monk instanceof Monk);
    }

    @Test
    public void givenAPaladinInputWhenCreatingCharacterThenOutputAPaladinClass() throws Exception {
        Character paladin = characterFactory.createCharacter("Paladin");
        assertTrue(paladin instanceof Paladin);
    }

    @Test
    public void givenARangerInputWhenCreatingCharacterThenOutputARangerClass() throws Exception {
        Character ranger = characterFactory.createCharacter("Ranger");
        assertTrue(ranger instanceof Ranger);
    }

    @Test
    public void givenARogueInputWhenCreatingCharacterThenOutputARogueClass() throws Exception {
        Character rogue = characterFactory.createCharacter("Rogue");
        assertTrue(rogue instanceof Rogue);
    }

    @Test
    public void givenASorcererInputWhenCreatingCharacterThenOutputASorcererClass() throws Exception {
        Character sorcerer = characterFactory.createCharacter("Sorcerer");
        assertTrue(sorcerer instanceof Sorcerer);
    }

    @Test
    public void givenAWarlockInputWhenCreatingCharacterThenOutputAWarlockClass() throws Exception {
        Character warlock = characterFactory.createCharacter("Warlock");
        assertTrue(warlock instanceof Warlock);
    }

    @Test
    public void givenAWizardInputWhenCreatingCharacterThenOutputAWizardClass() throws Exception {
        Character wizard = characterFactory.createCharacter("Wizard");
        assertTrue(wizard instanceof Wizard);
    }
}
