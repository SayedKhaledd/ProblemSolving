package org.example.leetcode.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTests {

    @Test
    void testAreIsomorphicStrings_Case1() {
        String a = "egg";
        String b = "add";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertTrue(isomorphicStrings.isIsomorphic(a, b));
    }

    @Test
    void testAreIsomorphicStrings_Case2() {
        String a = "foo";
        String b = "bar";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertFalse(isomorphicStrings.isIsomorphic(a, b));
    }

    @Test
    void testAreIsomorphicStrings_Case3() {
        String a = "paper";
        String b = "title";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertTrue(isomorphicStrings.isIsomorphic(a, b));
    }
    @Test
    void testAreIsomorphicStrings_Case4() {
        String a = "badc";
        String b = "baba";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertFalse(isomorphicStrings.isIsomorphic(a, b));
    }

    //for the second approach
    @Test
    void testAreIsomorphicStrings_SecondApproach_Case1() {
        String a = "egg";
        String b = "add";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertTrue(isomorphicStrings.isIsomorphic2(a, b));
    }

    @Test
    void testAreIsomorphicStrings_SecondApproach_Case2() {
        String a = "foo";
        String b = "bar";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertFalse(isomorphicStrings.isIsomorphic2(a, b));
    }

    @Test
    void testAreIsomorphicStrings_SecondApproach_Case3() {
        String a = "paper";
        String b = "title";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertTrue(isomorphicStrings.isIsomorphic2(a, b));
    }
    @Test
    void testAreIsomorphicStrings_SecondApproach_Case4() {
        String a = "badc";
        String b = "baba";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertFalse(isomorphicStrings.isIsomorphic2(a, b));
    }
}
