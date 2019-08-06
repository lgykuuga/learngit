package com.lgy.leetcode;

import org.thymeleaf.util.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 *
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 *
 * 说明:
 *
 *     输出结果中的每个元素一定是唯一的。
 *     我们可以不考虑输出结果的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Intersection {

    public static void main(String[] args) {

    }

    /**
     * 执行用时 :29 ms, 在所有 Java 提交中击败了10.43% 的用户
     * 内存消耗 :38 MB, 在所有 Java 提交中击败了24.36%的用户
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num1: nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    set.add(num1);
                }
            }
        }

        int[] ints = new int[set.size()];

        if (set.isEmpty() || set.size() == 0) {
            return ints;
        }

        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            ints[i] = iterator.next();
            i++;
        }

        return ints;
    }

    /**
     * 执行用时 :8 ms, 在所有 Java 提交中击败了63.84% 的用户
     * 内存消耗 :37.5 MB, 在所有 Java 提交中击败了30.61%的用户

     */
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int num1 : nums1) {
            set1.add(num1);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num2 : nums2) {
            set2.add(num2);
        }

        if (set1.size() >= set2.size()) {
            return method(set1, set2);
        } else {
            return method(set2, set1);
        }

    }

    private int[] method(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] ints = new int[set1.size()];
        int index = 0;
        for (Integer s1: set1) {
            if (set2.contains(s1)) {
                ints[index] = s1;
                index++;
            }
        }
        //后面的0都不要
        return Arrays.copyOf(ints, index);
    }

}
