package com.lgy.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 *
 * 示例 1:
 *
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 * 说明:
 *
 *     字符串 S 的长度范围为 [1, 10000]。
 *     C 是一个单字符，且保证是字符串 S 里的字符。
 *     S 和 C 中的所有字母均为小写字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-distance-to-a-character
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ShortestToChar {

    public static void main(String[] args) {
        String S ="loveleetcode";
        char C = 'e';
        int[] ints = shortestToChar(S, C);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public static int[] shortestToChar(String S, char C) {
        int array[] = new int[S.length()];
        List<Integer> list = new ArrayList<Integer>();//C数组下标集合
        int j = 0;
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) {
                list.add(i);
                j++;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            int min = S.length();
            for (int k = 0; k < list.size(); k++) {
                int temp = Math.abs(i - list.get(k));//最短路径
                if (temp == 0) {
                    min = 0;
                    break;
                }
                if (temp < min) {
                    min = temp;
                }

            }
            array[i] = min;
        }

        return array;
    }
}
