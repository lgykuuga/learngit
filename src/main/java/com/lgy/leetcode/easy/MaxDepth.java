package com.lgy.leetcode.easy;

import com.lgy.leetcode.domain.Node;

import java.util.List;

/**
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * 例如，给定一个 3叉树 :
 *
 * 我们应返回其最大深度，3。
 *
 * 说明:
 *
 *     树的深度不会超过 1000。
 *     树的节点总不会超过 5000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxDepth {

    public static void main(String[] args) {

        Node root = new Node();

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(Node root) {

        if (root == null || root.children == null) {
            return 0;
        }

        int max = 0;

        for (Node node : root.children) {
            int depth = maxDepth(node);//返回最大深度
            max = Math.max(max,depth);//比较最大深度
        }

        return max + 1;

    }
}
