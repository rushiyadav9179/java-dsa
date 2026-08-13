package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Problem Name: Binary Tree Right Side View
// Topic: Trees, BFS, Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

public class BinaryTreeRightSideView {

    public List<Integer> solution(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                TreeNode node = q.remove();

                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }

                // Last node of current level
                if(i == size - 1) {
                    ans.add(node.val);
                }
            }
        }

        return ans;
    }
}