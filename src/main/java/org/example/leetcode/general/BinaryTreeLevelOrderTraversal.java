package org.example.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if (root == null)
            return arr;

         

        return arr;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if (root == null)
            return arr;

        List<Integer> init = new ArrayList<>();
        init.add(root.val);
        arr.add(init);

        TreeNode curr = root;


        return arr;
    }

    public void addNodes(TreeNode root, List<List<Integer>> arr) {
        ArrayList<Integer> init = null;
        if (root == null)
            return;
        if (root.left != null && root.right != null) {
            init = new ArrayList<>();
            init.add(root.left.val);
            init.add(root.right.val);
            addNodes(root.left, arr);
            addNodes(root.right, arr);
        } else if (root.left != null) {
            init = new ArrayList<>();
            init.add(root.left.val);
            addNodes(root.left, arr);
        } else if (root.right != null) {
            init = new ArrayList<>();
            init.add(root.right.val);
            addNodes(root.right, arr);
        }
        if (init != null)
            arr.add(init);

    }
}
