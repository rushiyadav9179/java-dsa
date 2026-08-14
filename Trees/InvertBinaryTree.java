package Trees;

// Problem Name: Invert Binary Tree
// Topic: Trees, DFS, Recursion
// Time Complexity: O(n)
// Space Complexity: O(h)

public class InvertBinaryTree {

    public TreeNode invert(TreeNode node) {

        if(node == null) {
            return null;
        }

        node.left = invert(node.left);
        node.right = invert(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;
    }

    public TreeNode solution(TreeNode root) {
        return invert(root);
    }
}