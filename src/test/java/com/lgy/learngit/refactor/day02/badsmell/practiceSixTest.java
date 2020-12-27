package com.lgy.learngit.refactor.day02.badsmell;

import com.lgy.refactor.day02.badsmell.practiceSix.CheckInSystem;
import com.lgy.refactor.day02.badsmell.practiceSix.Employee;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class practiceSixTest {
    @Test
    public void should_only_pay_monthly_salary_given_employee_is_engineer(){
        int monthlySalary = 10000;
        Employee engineer = new Employee(Employee.ENGINEER, "Tom", monthlySalary, 1000, 100);
        assertEquals(monthlySalary, engineer.payAmount());
    }

    @Test
    public void should_pay_monthly_salary_and_commission_given_employee_is_salesman(){
        int commission = 1000;
        int monthlySalary = 10000;
        Employee salesman = new Employee(Employee.SALESMAN, "Tom", monthlySalary, commission, 100);
        assertEquals(monthlySalary + commission, salesman.payAmount());
    }

    @Test
    public void should_pay_monthly_salary_and_bonus_given_employee_is_manager(){
        int monthlySalary = 10000;
        int bonus = 100;
        Employee salesman = new Employee(Employee.MANAGER, "Tom", monthlySalary, 1000, bonus);
        assertEquals(monthlySalary + bonus, salesman.payAmount());
    }

    @Test
    public void should_return_different_record_message_with_different_employee_type(){
        Employee engineer = new Employee(Employee.ENGINEER, "Tom", 10000, 1000, 100);
        Employee salesman = new Employee(Employee.SALESMAN, "Jerry", 10000, 1000, 100);
        Employee manager = new Employee(Employee.MANAGER, "Tim", 10000, 1000, 100);

        CheckInSystem checkInSystem = new CheckInSystem();
        assertEquals("I am an Engineer, My Name is Tom", checkInSystem.checkIn(engineer));
        assertEquals("I am a Salesman, My Name is Jerry", checkInSystem.checkIn(salesman));
        assertEquals("I am a Manager, My Name is Tim", checkInSystem.checkIn(manager));
    }
}
