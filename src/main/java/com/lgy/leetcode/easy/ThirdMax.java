package com.lgy.leetcode.easy;

import java.util.*;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 *
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 *
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ThirdMax {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        //去重
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        if (list.size() == 2) {
            return Math.max(list.get(0), list.get(1));
        } else if (list.size() == 1) {
            return list.get(0);
        }

        return list.get(2);
    }

    public static int thirdMax2(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        if (third == Long.MIN_VALUE || third == second) {
            return (int)first;
        }

        return (int)third;

    }





}
