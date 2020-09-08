package com.lgy.learngit.lamdba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        List<DirectionalItemDTO> itemDTOS = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            DirectionalItemDTO item = new DirectionalItemDTO();
            item.setProductIndex(1);
            itemDTOS.add(item);
        }
        itemDTOS = itemDTOS.stream().sorted(Comparator.comparing(DirectionalItemDTO::getProductIndex)).collect(Collectors.toList());
        System.out.println(itemDTOS);
    }




}
