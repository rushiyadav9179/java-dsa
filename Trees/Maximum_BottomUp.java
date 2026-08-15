package Trees;

// Problem Name: Maximum Depth of Binary Tree
// LeetCode: 104
// Topic: Trees, DFS, Recursion
// Time Complexity: O(n)
// Space Complexity: O(h)

public class Maximum_BottomUp {

    int ans;

    // Top-Down DFS
    public void depth(TreeNode node, int depth) {

        if(node == null) {
            return;
        }

        ans = Math.max(ans, depth);

        depth(node.left, depth + 1);
        depth(node.right, depth + 1);
    }

    public int solution(TreeNode root) {

        ans = 0;

        if(root == null) {
            return 0;
        }

        depth(root, 1);

        return ans;
    }

    public static void main(String[] args) {

        Maximum_BottomUp obj = new Maximum_BottomUp();

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = obj.solution(root);

        System.out.println("Maximum Depth: " + result);
    }
}