package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 *
 *     谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 */
public class InvertTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(7);
        left.left = new TreeNode(9);
        left.right = new TreeNode(6);
        root.left = left;
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(3);
        right.right = new TreeNode(1);
        root.right = right;
        TreeNode treeNode = invertTree2(root);
        System.out.println(treeNode.val);
        System.out.println(treeNode.left.val);
        System.out.print(treeNode.right.val);
        System.out.println(treeNode.left.left.val);
        System.out.println(treeNode.left.right.val);
        System.out.println(treeNode.right.left.val);
        System.out.println(treeNode.right.right.val);
    }


    public static TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree1(root.left);
        TreeNode right = invertTree1(root.right);
        root.right = left;
        root.left = right;
        return root;
    }

    public static TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queque = new LinkedList<TreeNode>();
        queque.add(root);

        while (!queque.isEmpty()) {
            TreeNode poll = queque.poll();//弹出
            TreeNode temp = poll.left;
            poll.left = poll.right;
            poll.right = temp;
            if (poll.left != null) {
                queque.add(poll.left);
            }
            if (poll.right != null) {
                queque.add(poll.right);
            }
        }
        return root;

    }

}
