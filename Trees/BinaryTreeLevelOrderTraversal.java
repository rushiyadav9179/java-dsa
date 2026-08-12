package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Problem Name: Binary Tree Level Order Traversal
// Topic: Trees, BFS, Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> solution(TreeNode root) {

        List<List<Integer>> arr = new ArrayList<>();

        if(root == null) {
            return arr;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            List<Integer> level = new ArrayList<>();

            int size = q.size();

            for(int i = 0; i < size; i++) {

                TreeNode node = q.remove();

                level.add(node.val);

                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }
            }

            arr.add(level);
        }

        return arr;
    }
}