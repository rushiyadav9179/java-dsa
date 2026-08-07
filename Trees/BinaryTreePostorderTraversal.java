package Trees;

import java.util.ArrayList;
import java.util.List;

// Problem Name: Binary Tree Postorder Traversal
// Topic: Trees, DFS, Recursion
// Time Complexity: O(n)
// Space Complexity: O(h)

public class BinaryTreePostorderTraversal {

    // Definition for a binary tree node.
    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<Integer> ans;

    public void post(TreeNode node) {

        if(node == null) {
            return;
        }

        post(node.left);
        post(node.right);

        ans.add(node.val);
    }

    public List<Integer> solution(TreeNode root) {

        ans = new ArrayList<>();

        post(root);

        return ans;
    }

    public static void main(String[] args) {

        BinaryTreePostorderTraversal obj = new BinaryTreePostorderTraversal();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.solution(root);

        System.out.println(result);
    }
}