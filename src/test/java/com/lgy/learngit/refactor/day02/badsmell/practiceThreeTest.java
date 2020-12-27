package com.lgy.learngit.refactor.day02.badsmell;

import com.lgy.refactor.day02.badsmell.practiceThree.Deliver;
import com.lgy.refactor.day02.badsmell.practiceThree.Order;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class practiceThreeTest {
    @Test
    public void should_return_true_given_same_buyer(){
        String buyer = "buyer";
        String buyerPhoneNumber = "13131313131";
        String buyerAddress = "BeiJin";
        Order order = new Order(buyer, buyerPhoneNumber, buyerAddress);
        Deliver deliver = new Deliver(12345, "120", 60d, buyer, buyerPhoneNumber, buyerAddress);

        assertTrue(order.sameBuyer(deliver.getBuyerName(), deliver.getBuyerPhoneNumber(), deliver.getBuyerAddress()));
    }
}
