package org.example.leetcode.arraysandhashing;

import java.util.Hashtable;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Hashtable<Integer, Integer> table = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            int x=nums[i];
            if (table.get(x) != null)
                return true;
            else
                table.put(x, 1);


        }
        return false;

    }
}
