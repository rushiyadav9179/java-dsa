package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Problem Name: Binary Tree Preorder Traversal
// Topic: Trees, DFS, Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

public class BinaryTreePreorderTraversal {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> solution(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) {
            return ans;
        }

        stack.push(root);

        while(!stack.isEmpty()) {

            TreeNode node = stack.pop();

            ans.add(node.val);

            if(node.right != null) {
                stack.push(node.right);
            }

            if(node.left != null) {
                stack.push(node.left);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        BinaryTreePreorderTraversal obj = new BinaryTreePreorderTraversal();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.solution(root);

        System.out.println(result);
    }
}