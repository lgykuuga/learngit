package com.lgy.nowcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description 跳盒子
 *
 * 时间限制：1秒
 *
 * 空间限制：32768K
 *
 * 小v在公司负责游戏运营，今天收到一款申请新上架的游戏“跳一跳”，为了确保提供给广大玩家朋友们的游戏都是高品质的，按照运营流程小v必须对新游戏进行全方位了解体验和评估。这款游戏的规则如下：
 *
 *         有n个盒子排成了一行，每个盒子上面有一个数字a[i]，表示在该盒子上的人最多能向右移动a[i]个盒子（比如当前所在盒子上的数字是3，则表示可以一次向右前进1个盒子，2个盒子或者3个盒子）。
 *
 * 现在小v从左边第一个盒子上开始体验游戏，请问最少需要移动几次能到最后一个盒子上？
 *
 * 输入描述:
 *
 * 输入 ：2 2 3 0 4
 *
 * 表示现在有5个盒子，上面的数字分别是2, 2, 3, 0, 4。
 *
 *
 * 输出描述:
 *
 * 输出：2
 *
 * 小v有两种跳法：
 *
 * 跳法1：盒子1 -> 盒子2 -> 盒子3 -> 盒子5，共3下
 *
 * 跳法2：盒子1 -> 盒子3 -> 盒子5，共2下
 *
 * 跳法2的步骤数最少，所以输出最少步数：2。
 *
 *
 * 输入例子1:
 *
 * 2 2 3 0 4
 *
 *
 * 输出例子1:
 *
 * 2
 * @Author LGy
 * @Date 2019/11/15 11:48
 **/
public class JumpBox {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int[] input = CommonsUtils.parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }



    private static int solution(int[] input) {

        //如果只有一个盒子
        if (input.length == 1) {
            return 1;
        }




        return -1;
    }
}
