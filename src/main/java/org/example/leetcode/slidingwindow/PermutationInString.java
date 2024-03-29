package org.example.leetcode.slidingwindow;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("adc", "dcda"));
    }


    public static boolean compare(int[] arr, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] s1Fre = new int[26];
        int[] s2Fre = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Fre[s1.charAt(i) - 'a']++;
            s2Fre[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (compare(s1Fre, s2Fre)) {
                return true;
            }
            s2Fre[s2.charAt(i) - 'a']--;
            s2Fre[s2.charAt(i + s1.length()) - 'a']++;

        }
        return compare(s2Fre, s1Fre);

    }

    public static boolean checkInclusion2(String s1, String s2) {
        int size = s1.length();
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int count = 0;
        int[] freqTemp = new int[26];

        for (int i = 0, j = 0; i < s2.length() && j < s2.length(); ) {
            int currIndex = s2.charAt(j) - 'a';
            if (freq[currIndex] != 0) {
                System.out.println("entered here 1 at " + j);
                freqTemp[currIndex]++;
                if (freqTemp[currIndex] > freq[currIndex]) {
                    System.out.println("entered here 3 at " + j);
                    count = 0;
                    i++;
                    j = i;
                    freqTemp = new int[26];

                } else {
                    System.out.println("entered here 4 at " + j);
                    count++;
                    j++;
                }

                System.out.println("count is " + count + " and j is " + j);

            } else {
                System.out.println("entered here 2 at " + j);

                i++;
                j = i;
                count = 0;
                freqTemp = new int[26];

            }

            if (count == size) {
                if (compare(freq, freqTemp))
                    return true;
                else {
                    count = 0;
                    i++;
                    j = i;
                    freqTemp = new int[26];
                }
            }
        }
        return count == size;

    }

}

