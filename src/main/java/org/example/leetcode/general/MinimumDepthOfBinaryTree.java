package org.example.leetcode.general;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();
        Optional<Integer> o = Optional.empty();
        String insurance = "Sas";

        Optional<String> optInsurance = Optional.ofNullable(insurance);
        Optional<String> name = optInsurance.map(String::toLowerCase);
    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return 1 + minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);

        return 1 + Math.min(minDepth(root.right), minDepth(root.left));
    }

    //much better
    public int minDepth2(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int size = q.size();

            while (size > 0) {
                size--;
                TreeNode node = q.remove();

                if (node == null)
                    continue;
                if (node.left == null && node.right == null)
                    return depth;

                q.add(node.left);
                q.add(node.right);
            }
            depth++;
        }

        return -1;
    }
}
