package com.lgy.refactor.day02.badsmell.practiceSix;

import java.util.HashMap;
import java.util.Map;

public class CheckInSystem {
    private Map<String, String> checkInRecords = new HashMap<>();

    public String checkIn(Employee employee){
        int type = employee.getType();
        String record;
        switch (type) {
            case Employee.ENGINEER:
                record = "I am an Engineer, My Name is " + employee.getName();
                break;
            case Employee.SALESMAN:
                record = "I am a Salesman, My Name is " + employee.getName();
                break;
            case Employee.MANAGER:
                record = "I am a Manager, My Name is " + employee.getName();
                break;
            default:
                record = "";
        }

        checkInRecords.put(employee.getId(), record);

        return record;
    }
}
