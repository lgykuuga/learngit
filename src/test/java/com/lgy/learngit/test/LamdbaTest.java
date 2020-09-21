package com.lgy.learngit.test;

import com.lgy.learngit.test.bean.ShopBean;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author LGy
 * @Date 2019/12/18 16:22
 **/
public class LamdbaTest {

    public static void main(String[] args) {
        List<ShopBean> shops = new ArrayList<>();

        int i = 1;

        for (int j = 0; j < 10; j++) {
            ShopBean shopBean = new ShopBean();
            shopBean.setShopCode("shop" + i);
            if (i % 3 == 0) {
                shopBean.setPlateform("TB");
            } else if (i % 3 == 1) {
                shopBean.setPlateform("JD");
            } else {
                shopBean.setPlateform("VIP");
            }
            shopBean.setOrderNumber((int)(Math.random() * 10000));
            shops.add(shopBean);
            i++;
        }

        ShopBean shopBean = new ShopBean();
        shopBean.setShopCode("shop3");
        shopBean.setPlateform("TB");
        shops.add(shopBean);

        for (ShopBean shop : shops) {
            System.out.println("分组前:" + shop);
        }
        System.out.println("=============================================================");
//        calculate(shops);
        dis(shops);
    }

    private static void dis(List<ShopBean> shops) {
        shops = shops.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(
                                () -> new TreeSet<>(
                                        Comparator.comparing(
                                                p -> p.getShopCode()+p.getPlateform()))),
                        ArrayList::new));

        System.out.println(shops);
        System.out.println("size:" + shops.size());

    }

    /** 根据平台、单量分组 */
    private static void calculate(List<ShopBean> shops) {

        Map<String, List<ShopBean>> collect = shops.stream().collect(Collectors.groupingBy(shop -> shop.getPlateform()));

        Iterator<Map.Entry<String, List<ShopBean>>> iterator = collect.entrySet().iterator();

        //记录最小数量的分组
        String minGroup = "";
        long minGroupNumber = 0;

        while(iterator.hasNext()) {
            Map.Entry<String, List<ShopBean>> next = iterator.next();
            List<ShopBean> shopBeanList = next.getValue();
            IntSummaryStatistics intSummaryStatistics = shopBeanList.stream().mapToInt((s) -> s.getOrderNumber()).summaryStatistics();
            if ((intSummaryStatistics.getSum() < minGroupNumber) || minGroupNumber == 0L) {
                minGroup = next.getKey();
                minGroupNumber = intSummaryStatistics.getSum();
            }
            System.out.println("分组：" + next.getKey()  + ", groupSum: " + intSummaryStatistics.getSum() + ", size:" + shopBeanList.size());
        }



        System.out.println("minGroup:" + minGroup  + ", minGroupNumber: " + minGroupNumber);



    }


}
