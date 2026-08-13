package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Problem Name: Find Largest Value in Each Tree Row
// Topic: Trees, BFS, Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

public class FindLargestValueInEachTreeRow {

    public List<Integer> solution(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++) {

                TreeNode node = q.remove();

                max = Math.max(max, node.val);

                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }
            }

            ans.add(max);
        }

        return ans;
    }
}