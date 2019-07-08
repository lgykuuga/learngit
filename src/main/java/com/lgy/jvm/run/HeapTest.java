package com.lgy.jvm.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeapTest {

    public static void main(String[] args) {
        List<HeapTest> heapTestList = new ArrayList<>();


        Map<String, String> map = new HashMap<>();
        map.put("1","1");

        int i =0;
        while (true) {
            HeapTest heapTest = new HeapTest();
            heapTestList.add(heapTest);
            System.out.println("sout:" + i);
            i++;
        }


    }

}
