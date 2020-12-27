package com.lgy.learngit.refactor.day01.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String trans(int input) {

        if (String.valueOf(input).contains("3")) {
            return FIZZ;
        }

        String result = "";
        if (input % 3 == 0) {
            result += FIZZ;
        }
        if (input % 5 == 0) {
            result += BUZZ;
        }
        if (input % 7 == 0) {
            result += WHIZZ;
        }

        if (input % 5 == 0 && input % 7 == 0) {
            return BUZZ + WHIZZ;
        }

        if (input % 3 == 0) {
            return FIZZ;
        }

        if (input % 5 == 0) {
            return BUZZ;
        }

        if (input % 7 == 0) {
            return WHIZZ;
        }

        return String.valueOf(input);

    }

}
