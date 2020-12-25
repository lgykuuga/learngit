package com.lgy.learngit.refactor;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_transfer_given_input_1(){
        //given
        int input = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_transfer_given_input_3(){
        //given
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("Fizz", result);
    }


    @Test
    public void should_return_buzz_when_transfer_given_input_5(){
        //given
        int input = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_buzzwhizz_when_transfer_given_input_70(){
        //given
        int input = 70;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_fizzbuzz_when_transfer_given_input_15(){
        //given
        int input = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_whizz_when_transfer_given_input_7(){
        //given
        int input = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_transfer_given_input_105(){
        //given
        int input = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void should_return_fizz_when_transfer_given_input_contains3(){
        //given
        int input = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.trans(input);

        //then
        Assertions.assertEquals("Fizz", result);
    }


}
