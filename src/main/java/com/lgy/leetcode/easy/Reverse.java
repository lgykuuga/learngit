package com.lgy.leetcode.easy;

import java.math.BigDecimal;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse2(123));
    }

    public static int reverse(int x) {
        BigDecimal bigDecimal = new BigDecimal(x);
        String str = String.valueOf(bigDecimal.abs());
        String s = new StringBuilder(str).reverse().toString();
        int i = Integer.parseInt(s);
        if (x >= 0) {
            return i;
        } else {
            return 0 - i;
        }
    }

    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10; x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


}
