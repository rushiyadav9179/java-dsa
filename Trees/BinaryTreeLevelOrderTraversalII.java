package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Problem Name: Binary Tree Level Order Traversal II
// Topic: Trees, BFS, Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> solution(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

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

            ans.add(level);
        }

        // Reverse the levels
        int left = 0;
        int right = ans.size() - 1;

        while(left < right) {

            List<Integer> temp = ans.get(left);
            ans.set(left, ans.get(right));
            ans.set(right, temp);

            left++;
            right--;
        }

        return ans;
    }
}