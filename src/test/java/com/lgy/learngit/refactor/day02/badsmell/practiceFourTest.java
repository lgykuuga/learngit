package com.lgy.learngit.refactor.day02.badsmell;

import com.lgy.refactor.day02.badsmell.practiceFour.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class practiceFourTest {
    @Test
    public void should_get_an_egg_given_animal_is_chicken(){
        Animal chicken = new Chicken();
        assertEquals("Get an egg.", chicken.provide());
    }

    @Test
    public void should_get_milk_given_animal_is_cow(){
        Animal cow = new Cow();
        assertEquals("Get milk.", cow.provide());
    }

    @Test
    public void should_get_an_egg_given_animal_is_duck(){
        Animal duck = new Duck();
        assertEquals("Get an egg.", duck.provide());
    }

    @Test
    public void should_get_milk_given_animal_is_goat(){
        Animal goat = new Goat();
        assertEquals("Get milk.", goat.provide());
    }
}
