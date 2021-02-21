package com.lgy.learngit.exception;

import com.lgy.exception.AException;
import com.lgy.exception.RunException;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    public void test1() {
        RunException runException = new RunException();
        try {
            runException.start();
        }catch (AException e) {
            System.out.println("catchAAAAAAA");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("catch:================");
            e.printStackTrace();
        }
        System.out.println("end:================");
    }

}
