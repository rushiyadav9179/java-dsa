package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Problem Name: Maximum Depth of Binary Tree
// Topic: Trees, DFS, Recursion
// Time Complexity: O(n)
// Space Complexity: O(h)

public class MaximumDepthOfBinaryTree {

    public int depth(TreeNode node) {

        if(node == null) {
            return 0;
        }

        int left = depth(node.left);
        int right = depth(node.right);

        return 1 + Math.max(left, right);
    }

    public int solution(TreeNode root) {
        return depth(root);
    }
}