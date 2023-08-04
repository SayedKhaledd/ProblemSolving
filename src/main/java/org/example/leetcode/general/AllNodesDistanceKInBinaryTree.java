package org.example.leetcode.general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//not yet
public class AllNodesDistanceKInBinaryTree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);

        while (!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            while (size > 0) {
                size--;
                TreeNode node = treeNodes.remove();

                if (node.left != null && node.right != null) {
                    treeNodes.add(node.left);
                    treeNodes.add(node.right);
                }
            }
        }


        return result;
    }
}
