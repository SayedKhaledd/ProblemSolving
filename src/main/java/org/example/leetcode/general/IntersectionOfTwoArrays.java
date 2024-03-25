package org.example.leetcode.general;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/description/
public class IntersectionOfTwoArrays {

    /*
     * Runtime: 4 ms Beats 32.21% of users with Java
     * Memory: 43.23 MB Beats 48.86% of users with Java
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqNums1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            uniqNums1.add(nums1[i]);
        }
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (uniqNums1.contains(nums2[i]))
                result.add(nums2[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
     * Runtime: 6 ms  Beats 14.46% of users with Java
     * Memory: 42.94 MB Beats 81.76% of users with Java
     */
    public static int[] intersectionApproach2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> result = new HashSet<>();
        int p1 = 0, p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {

            if (nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else
                p2++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();


    }

    /*
     * Runtime: 6 ms  Beats 14.46% of users with Java
     * Memory: 43.58 MB Beats 15.84% of users with Java
     */
    public static int[] intersectionApproach3(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>(Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new)));
        Set<Integer> nums2Set = new HashSet<>(Arrays.asList(Arrays.stream(nums2).boxed().toArray(Integer[]::new)));
        nums1Set.retainAll(nums2Set);
        return nums1Set.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
     * Runtime: 6 ms  Beats 14.46% of users with Java
     * Memory: 43.74 MB Beats 5.91% of users with Java
     */

    public static int[] intersectionApproach4(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>(Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new)));
        Set<Integer> nums2Set = new HashSet<>(Arrays.asList(Arrays.stream(nums2).boxed().toArray(Integer[]::new)));

        return nums1Set.size() < nums2Set.size() ? setIntersection(nums1Set, nums2Set) : setIntersection(nums2Set, nums1Set);
    }

    private static int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
        return set1.stream().filter(set2::contains).mapToInt(Integer::intValue).toArray();
    }

    /*
     * Runtime: 5 ms Beats 19.62% of users with Java
     * Memory: 43.69 MB Beats 9.74% of users with Java
     */

    public static int[] intersectionApproach5(int[] num1, int[] nums2) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int c : num1) {
            seen.put(c, 1);
        }
        Set<Integer> result = new HashSet<>();
        for (int c : nums2) {
            if (seen.containsKey(c) && seen.get(c) == 1)
                result.add(c);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }


}

