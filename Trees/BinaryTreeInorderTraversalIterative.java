package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Problem Name: Binary Tree Inorder Traversal
// Topic: Trees, DFS, Stack
// Approach: Iterative
// Time Complexity: O(n)
// Space Complexity: O(h)

public class BinaryTreeInorderTraversalIterative {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> solution(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) {
            return list;
        }

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {

            // Go as far left as possible
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Visit node
            TreeNode node = stack.pop();
            list.add(node.val);

            // Move to right subtree
            curr = node.right;
        }

        return list;
    }

    public static void main(String[] args) {

        BinaryTreeInorderTraversalIterative obj =
                new BinaryTreeInorderTraversalIterative();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.solution(root);

        System.out.println(result);
    }
}