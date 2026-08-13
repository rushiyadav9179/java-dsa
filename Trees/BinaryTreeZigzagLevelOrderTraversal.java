package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Problem Name: Binary Tree Zigzag Level Order Traversal
// Topic: Trees, BFS, Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> solution(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean forward = true;

        while(!q.isEmpty()) {

            List<Integer> level = new ArrayList<>();
            int size = q.size();

            for(int i = 0; i < size; i++) {

                TreeNode node = q.remove();

                if(forward) {
                    level.add(node.val);
                }
                else {
                    level.add(0, node.val);
                }

                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }
            }

            forward = !forward;

            ans.add(level);
        }

        return ans;
    }
}