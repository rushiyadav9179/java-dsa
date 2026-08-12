package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Problem Name: Average of Levels in Binary Tree
// Topic: Trees, BFS, Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

public class AverageOfLevelsInBinaryTree {

    public List<Double> solution(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();
            double sum = 0;

            for(int i = 0; i < size; i++) {

                TreeNode node = q.remove();

                sum += node.val;

                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }
            }

            ans.add(sum / size);
        }

        return ans;
    }
}