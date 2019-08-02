package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Generate {

    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        if (numRows == 1) {
            result.get(0).add(1);
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();//行

            row.add(1);

            for (int j = 0; j < numRows - 2; j++) {



            }

            row.add(1);

        }


        return result;
    }
}
