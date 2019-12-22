package com.lgy.nowcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Description 运矿石
 *
1、每次可以挖到多个矿石，每个矿石的重量都不一样，挖矿结束后需要通过一款平衡矿车运送下山；
2、平衡矿车有左右2个车厢，中间只有1个车轮沿着导轨滑到山下，且矿车只有在2个车厢重量完全相等且矿石数量相差不超过1个的情况下才能成功运送矿石，否则在转弯时可能出现侧翻。
假设小v挖到了n（n<100）个矿石，每个矿石重量不超过100，为了确保一次性将n个矿石都运送出去，一旦矿车的车厢重量不一样就需要购买配重砝码。
请问小v每次最少需要购买多少重量的砝码呢? （假设车厢足够放下这些矿石和砝码，砝码重量任选）

输入描述:

输入n个正整数表示每个矿石的重量


输出描述:

输出一个正整数表示最少需要购买的砝码重量


输入例子1:

3 7 4 11 8 10


输出例子1:

1


例子说明1:

小v可以将重量3,7和11的矿石放到左车厢，重量4，8和10 放到右车厢，然后购买重量为1的砝码放到左车厢
 * @Author LGy
 * @Date 2019/11/15 11:12
 **/
public class TransportOre {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int[] input = CommonsUtils.parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }


    private static int solution(int[] input) {

        if (input.length == 1) {
            return input[0];
        }

        //排序
        Arrays.sort(input);
        //总重量
        int weightcount = 0;

        for (int weight : input) {
            weightcount += weight;
        }

        //a车矿石理想重量
        int a = weightcount/2;
        //b车矿石理想重量
        int b = weightcount/2;
        //砝码重量
        int ore = weightcount - (a + b);

        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            temp += input[i];
            if (temp == a) {
                return 0;
            }


            
        }








        return -1;
    }

}
