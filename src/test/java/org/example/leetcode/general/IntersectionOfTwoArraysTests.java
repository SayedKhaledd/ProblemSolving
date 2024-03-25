package org.example.leetcode.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysTests {

    // first approach test cases
    @Test
    void testIntersection_case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays.intersection(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{2}, IntersectionOfTwoArrays.intersection(nums1, nums2));
    }

    @Test
    void testIntersection_case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays.intersection(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays.intersection(nums1, nums2));
    }

    // second approach test cases
    @Test
    void testIntersectionApproach2_case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays.intersectionApproach2(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{2}, IntersectionOfTwoArrays.intersectionApproach2(nums1, nums2));
    }

    @Test
    void testIntersectionApproach2_case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays.intersectionApproach2(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays.intersectionApproach2(nums1, nums2));
    }

    //third approach test cases
    @Test
    void testIntersectionApproach3_case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays.intersectionApproach3(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{2}, IntersectionOfTwoArrays.intersectionApproach3(nums1, nums2));
    }

    @Test
    void testIntersectionApproach3_case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays.intersectionApproach3(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays.intersectionApproach3(nums1, nums2));
    }

    //fourth approach test cases
    @Test
    void testIntersectionApproach4_case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays.intersectionApproach4(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{2}, IntersectionOfTwoArrays.intersectionApproach4(nums1, nums2));
    }

    @Test
    void testIntersectionApproach4_case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays.intersectionApproach4(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays.intersectionApproach4(nums1, nums2));
    }

    //fifth approach test cases
    @Test
    void testIntersectionApproach5_case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays.intersectionApproach5(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{2}, IntersectionOfTwoArrays.intersectionApproach5(nums1, nums2));
    }

    @Test
    void testIntersectionApproach5_case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays.intersectionApproach5(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays.intersectionApproach5(nums1, nums2));
    }

}
