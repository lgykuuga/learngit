package com.lgy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs3(10));
    }


    /**
     * 方法一：动态规划
     * @param n
     * @return
     */
    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

    /**
     * 方法二：备忘录法
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        Map<Integer, Integer> map = new HashMap<>();
        return climbStairs2_help(n, map);
    }

    private static int climbStairs2_help(int n, Map<Integer, Integer> map) {

        if (map.get(n) != null) {
            return map.get(n);
        }

        int i = climbStairs2(n - 1) + climbStairs2(n - 2);
        map.put(n, i);
        return i;
    }

    /**
     * 方法三：动态规划
     * @param n
     * @return
     */
    public static int climbStairs3(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int temp = 0;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= n ; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        return temp;
    }
}
