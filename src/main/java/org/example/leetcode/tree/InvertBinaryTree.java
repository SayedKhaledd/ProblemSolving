package org.example.leetcode.tree;

import org.example.leetcode.general.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.right;
        root.right = root.left;
        invertTree(root.right);
        root.left = temp;
        invertTree(root.left);

        return root;
    }
}
