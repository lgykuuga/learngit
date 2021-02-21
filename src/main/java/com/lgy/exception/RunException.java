package com.lgy.exception;

public class RunException {

    int one = 1;
    int zero = 0;

    public void start() throws Exception {
        start2();
    }

    public void start3() throws Exception {
        throwAException();
    }

    public void start2() throws Exception {
        try {
            throwAException();
            int i = one / zero;
            throwBException();
        } catch (BException e) {
            System.out.println("Exception" + e);
        }
    }



    private void throwAException() {
        throw new AException();
    }

    private void throwBException() throws Exception{
        throw new BException();
    }

}
