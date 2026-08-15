package Trees;

// Problem Name: Maximum Depth of Binary Tree
// LeetCode: 104
// Topic: Trees, DFS, Recursion
// Time Complexity: O(n)
// Space Complexity: O(h)

public class Maximum_BottomUp {

    // Top-Down DFS approach
    public int depth(TreeNode node, int currentDepth) {

        if(node == null) {
            return currentDepth - 1;
        }

        int left = depth(node.left, currentDepth + 1);
        int right = depth(node.right, currentDepth + 1);

        return Math.max(left, right);
    }

    public int solution(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return depth(root, 1);
    }


    /*
     * Bottom-Up DFS approach
     *
     * public int depth(TreeNode node) {
     *
     *     if(node == null) {
     *         return 0;
     *     }
     *
     *     int left = depth(node.left);
     *     int right = depth(node.right);
     *
     *     return 1 + Math.max(left, right);
     * }
     *
     * public int solution(TreeNode root) {
     *     return depth(root);
     * }
     */


    /*
     * Iterative BFS approach
     *
     * public int solution(TreeNode root) {
     *
     *     if(root == null) {
     *         return 0;
     *     }
     *
     *     int count = 0;
     *     Queue<TreeNode> q = new LinkedList<>();
     *     q.add(root);
     *
     *     while(!q.isEmpty()) {
     *
     *         int size = q.size();
     *         count++;
     *
     *         for(int i = 0; i < size; i++) {
     *
     *             TreeNode node = q.remove();
     *
     *             if(node.left != null) {
     *                 q.add(node.left);
     *             }
     *
     *             if(node.right != null) {
     *                 q.add(node.right);
     *             }
     *         }
     *     }
     *
     *     return count;
     * }
     */
}