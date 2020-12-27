package com.lgy.learngit.refactor.day02.badsmell;

import com.lgy.refactor.day02.badsmell.practiceFive.Baby;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class practiceFiveTest {
    @Test
    public void should_like_a_human_given_a_baby(){
            Baby baby = new Baby();
            baby.cry();
            baby.drink();
            baby.cry();
            baby.eat();
            baby.cry();
            baby.snore();
            baby.cry();
            baby.drink();
            baby.drink();
            baby.eat();

            long cryTimes = baby.getTimes("CRY");
            long eatTimes = baby.getTimes("EAT");
            long drinkTimes = baby.getTimes("DRINK");
            long snoreTimes = baby.getTimes("SNORE");
            assertEquals(4, cryTimes);
            assertEquals(3, drinkTimes);
            assertEquals(2, eatTimes);
            assertEquals(1, snoreTimes);
    }

}
