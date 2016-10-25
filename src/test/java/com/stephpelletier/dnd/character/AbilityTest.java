package com.stephpelletier.dnd.character;

import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Created by stephane on 2016-10-24.
 */
public class AbilityTest {
    @Test
    public void givenScoreOfTenWhenGettingModifierThenModifierIsZero() {
        int score = 10;
        Ability ability = new Ability(score);

        int modifier = ability.getModifier();

        assertEquals(0, modifier);
    }

    @Test
    public void givenScoreOfOneWhenGettingModifierThenModifierIsMinusFive() {
        int score = 1;
        Ability ability = new Ability(score);

        int modifier = ability.getModifier();

        assertEquals(-5, modifier);
    }

    @Test
    public void givenScoreOfThirtyWhenGettingModifierThenModifierIdTen() {
        int score = 30;
        Ability ability = new Ability(score);

        int modifier = ability.getModifier();

        assertEquals(10, modifier);
    }
}
