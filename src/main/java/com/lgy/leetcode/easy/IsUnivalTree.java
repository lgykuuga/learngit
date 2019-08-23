package com.lgy.leetcode.easy;

import com.lgy.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 *
 * 示例 2：
 *
 * 输入：[2,2,2,5,2]
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/univalued-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsUnivalTree {

    List<Integer> list = null;

    public static void main(String[] args) {

    }

    public boolean isUnivalTree(TreeNode root) {
        list = new ArrayList<>();
        //把tree值都放入list中
        setValue2List(root);
        for (Integer i : list) {
            if (i != list.get(0)) {
                return false;
            }
        }

        return true;
    }

    private void setValue2List(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            setValue2List(root.left);
            setValue2List(root.right);
        }
    }


}
