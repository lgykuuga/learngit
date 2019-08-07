package com.lgy.leetcode;

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 *
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 *
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/factorial-trailing-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TrailingZeroes {

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }

    public static int trailingZeroes(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }

        int b = 0;
        System.out.println(sum);

        //结尾有几个0
//        while(sum >= 10) {
//            if (sum%10 == 0) {
//                sum = sum/10;
//                b++;
//            } else {
//                break;
//            }
//        }

        //结果有几个0
        String s = String.valueOf(sum);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                b++;
            }
        }
        return b;
    }
}
