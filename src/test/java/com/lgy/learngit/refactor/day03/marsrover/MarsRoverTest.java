package com.lgy.learngit.refactor.day03.marsrover;

import com.lgy.refactor.day03.marsrover.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void should_x_plus_when_command_M_then_direction_E() {
        // given
        int x = 0;
        MarsRover marsRover = new MarsRover(x,0,"E");

        // when
        marsRover.execute("M");
        // then
        assertEquals(x + 1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_x_deduct_when_command_M_then_direction_W() {
        // given
        int x = 0;
        MarsRover marsRover = new MarsRover(x,0,"W");

        // when
        marsRover.execute("M");
        // then
        assertEquals(x - 1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_y_plus_when_command_M_then_direction_N() {
        // given
        int y = 0;
        MarsRover marsRover = new MarsRover(0, y,"N");

        // when
        marsRover.execute("M");
        // then
        assertEquals(0, marsRover.getX());
        assertEquals(y + 1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }


   @Test
    public void should_y_deduct_when_command_M_then_direction_S() {
        // given
        int y = 0;
        MarsRover marsRover = new MarsRover(0,y,"S");

        // when
        marsRover.execute("M");
        // then
        assertEquals(0, marsRover.getX());
        assertEquals(y - 1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_x_plus_when_command_MLR_then_direction_E() {
        // given
        int x = 0;
        MarsRover marsRover = new MarsRover(x,0,"E");

        // when
        marsRover.execute("MLR");
        // then
        assertEquals(x + 1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_N_when_command_L_then_direction_E() {
        // given
        MarsRover marsRover = new MarsRover(0,0,"E");

        // when
        marsRover.execute("L");
        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_W_when_command_L_then_direction_N() {
        // given
        MarsRover marsRover = new MarsRover(0,0,"N");

        // when
        marsRover.execute("L");
        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_S_when_command_L_then_direction_W() {
        // given
        MarsRover marsRover = new MarsRover(0,0,"W");

        // when
        marsRover.execute("L");
        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }


    @Test
    public void should_E_when_command_L_then_direction_S() {
        // given
        MarsRover marsRover = new MarsRover(0,0,"S");

        // when
        marsRover.execute("L");
        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_E_when_command_LMR_then_direction_S() {
        // given
        MarsRover marsRover = new MarsRover(0,0,"S");

        // when
        marsRover.execute("LMR");
        // then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }



}
