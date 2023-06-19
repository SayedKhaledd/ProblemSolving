package leetcode.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length(); ) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) return false;
            else {
                i++;
                j--;
            }

        }
        return true;
    }
}
