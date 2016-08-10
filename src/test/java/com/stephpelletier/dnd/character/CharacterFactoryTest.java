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
    public void givenAClericInputWhenCreatingCharacterThenOutputAClericClass() throws Exception {
        Character cleric = characterFactory.createCharacter("Cleric");
        assertTrue(cleric instanceof Cleric);
    }


}
