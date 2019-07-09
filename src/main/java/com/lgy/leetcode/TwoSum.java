package com.lgy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode刷题001
 * 给定 nums = [2, 7, 11, 15], target = 9 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] ints = twoSum2(nums, target);
        System.out.println(ints[0] + " "+ ints[1]);
    }

    //方法Ⅰ
    public static int[] twoSum(int[] nums, int target) {
        int val1 = 0;
        int val2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //方法Ⅱ
    public static int[] twoSum2(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
