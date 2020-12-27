package com.lgy.learngit.refactor.day02.badsmell;

import com.lgy.refactor.day02.badsmell.practiceTwo.Address;
import com.lgy.refactor.day02.badsmell.practiceTwo.AirwayBill;
import com.lgy.refactor.day02.badsmell.practiceTwo.CustomerName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class practiceTwoTest {
    @Test
    public void should_show_target_customer_info(){
        Address address = new Address("BeiXinQiao", 1, "BeiJin", "", "10000");
        CustomerName customerName = new CustomerName("sir", "Zhu", "Yuanzhang");
        AirwayBill airwayBill = new AirwayBill();
        airwayBill.setToAddress(address);
        airwayBill.setToCustomerName(customerName);

        String expect = "Customer: " +
                "sir: Zhu Yuanzhang" +
                System.lineSeparator() +
                "Address: " +
                1 + " " +
                "BeiXinQiao" + ", " +
                "BeiJin" + ", " +
                "" + ", " +
                "10000";
        String targetCustomerInfo = airwayBill.to();
        assertEquals(expect, targetCustomerInfo);
    }

    @Test
    public void should_show_source_customer_info(){
        Address address = new Address("BeiXinQiao", 1, "BeiJin", "", "10000");
        CustomerName customerName = new CustomerName("sir", "Zhu", "Yuanzhang");
        AirwayBill airwayBill = new AirwayBill();
        airwayBill.setFromAddress(address);
        airwayBill.setFromCustomerName(customerName);

        String expect = "Customer: " +
                "sir: Zhu Yuanzhang" +
                System.lineSeparator() +
                "Address: " +
                1 + " " +
                "BeiXinQiao" + ", " +
                "BeiJin" + ", " +
                "" + ", " +
                "10000";
        String sourceCustomerInfo = airwayBill.from();
        assertEquals(expect, sourceCustomerInfo);
    }
}
