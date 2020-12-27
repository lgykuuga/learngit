package com.lgy.refactor.day02.badsmell.practiceSix;

public class Employee {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    private String id;
    private int type;
    private String name;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(int type, String name, int monthlySalary, int commission, int bonus) {
        this.type = type;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Invalid employee");
        }
    }

    public String getId() {
        return id;
    }
}