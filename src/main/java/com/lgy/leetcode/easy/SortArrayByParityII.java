package com.lgy.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 *
 *
 * 提示：
 *
 *     2 <= A.length <= 20000
 *     A.length % 2 == 0
 *     0 <= A[i] <= 1000
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortArrayByParityII {

    public static void main(String[] args) {
        int[] A = new int[]{4,2,5,7};
        int[] ints = sortArrayByParityII(A);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    public static int[] sortArrayByParityII(int[] A) {
        //先把数组取出，把偶数放在数组偶数下标位置,奇数放在数组奇数下标位置
        int length = A.length;
        int[] result = new int[length];
        int i = 0;
        int j = 1;
        for (int a : A) {
            if (a %2 == 0) {
                result[i] = a;
                i += 2;
            } else {
                result[j] = a;
                j += 2;
            }
        }

        return result;
    }
}
