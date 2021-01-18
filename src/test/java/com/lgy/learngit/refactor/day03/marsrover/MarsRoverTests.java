package com.lgy.learngit.refactor.day03.marsrover;

import com.lgy.refactor.day03.marsrover.MarsRover;
import com.lgy.refactor.day03.marsrover.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTests {
    @Test
    public void should_x_plus_1_given_command_is_M_when_direction_is_E(){
        //given
        int x = 0;
        MarsRover marsRover = new MarsRover(x, 0, "E");

        //when
        marsRover.execute("M");

        //Then
        Assertions.assertEquals(x + 1, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_given_command_is_M_and_facing_W(){
        int x = 0;
        MarsRover marsRover = new MarsRover(x, 0, "W");
        String command = "M";
        marsRover.execute(command);
        Assertions.assertEquals(x - 1, marsRover.getX());
    }

    @Test
    public void should_return_y_plus_1_given_command_is_M_and_facing_N(){
        int y = 0;
        MarsRover marsRover = new MarsRover(0, y, "N");
        String command = "M";
        marsRover.execute(command);
        Assertions.assertEquals(y + 1, marsRover.getY());

    }

    @Test
    public void should_return_y_minus_1_given_command_is_M_and_facing_S(){
        int y = 0;
        MarsRover marsRover = new MarsRover(0, y, "S");
        String command = "M";
        marsRover.execute(command);
        Assertions.assertEquals(y - 1, marsRover.getY());
    }

    @Test
    public void should_x_plus_1_given_command_is_MLR_when_direction_is_E(){
        //given
        int x = 0;
        MarsRover marsRover = new MarsRover(x, 0, "E");

        //when
        marsRover.execute("MLR");

        //Then
        Assertions.assertEquals(x + 1, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_2_and_N_when_execute_MM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("MM");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(2, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_and_N_when_execute_MLR_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("MLR");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(1, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_2_y_4_and_N_when_execute_MLMMRMMML_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("MLMMRMMML");

        // then
        Assertions.assertEquals(-2, marsRover.getX());
        Assertions.assertEquals(4, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

        @Test
    public void should_return_init_position_given_command_is_empty(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_given_command_is_M_and_facing_is_E(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.execute("M");

        // then
        Assertions.assertEquals(1, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_given_command_is_M_and_facing_is_W(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.execute("M");

        // then
        Assertions.assertEquals(-1, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_y_plus_1_given_command_is_M_and_facing_is_N(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("M");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(1, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_1_given_command_is_M_and_facing_is_S(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.execute("M");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(-1, marsRover.getY());
        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_given_command_is_L_and_direction_is_E(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.execute("L");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_given_command_is_L_and_direction_is_N(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("L");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_given_command_is_L_and_direction_is_W(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.execute("L");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_given_command_is_L_and_direction_is_S(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.execute("L");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_given_command_is_R_and_direction_is_E(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.execute("R");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_given_command_is_R_and_direction_is_S(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.execute("R");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_given_command_is_R_and_direction_is_W(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.execute("R");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_given_command_is_R_and_direction_is_N(){
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.execute("R");

        // then
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }
}
