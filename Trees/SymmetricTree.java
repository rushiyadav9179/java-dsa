package Trees;

// Problem Name: Symmetric Tree
// Topic: Trees, DFS, Recursion
// Time Complexity: O(n)
// Space Complexity: O(h)

public class SymmetricTree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean helper(TreeNode left, TreeNode right) {

        if(left == null && right == null) {
            return true;
        }

        if(left == null || right == null) {
            return false;
        }

        if(left.val != right.val) {
            return false;
        }

        return helper(left.left, right.right)
                && helper(left.right, right.left);
    }

    public boolean solution(TreeNode root) {

        if(root == null) {
            return true;
        }

        return helper(root.left, root.right);
    }

    public static void main(String[] args) {

        SymmetricTree obj = new SymmetricTree();

        /*
                 1
                / \
               2   2
              / \ / \
             3  4 4  3
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean result = obj.solution(root);

        System.out.println("Is Symmetric: " + result);
    }
}