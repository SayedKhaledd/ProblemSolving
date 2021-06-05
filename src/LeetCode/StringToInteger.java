package LeetCode;

import java.util.Scanner;

//https://leetcode.com/problems/string-to-integer-atoi/
public class StringToInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(value(s));

    }

    public static int value(String l) {
        StringBuilder myBuilder = new StringBuilder(l);
        l = edit(l, myBuilder);

        try {
            double x = Double.parseDouble(l);
            return x > Integer.MAX_VALUE ? Integer.MAX_VALUE : x < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) x;

        } catch (Exception e) {
            return 0;
        }


    }

    public static String edit(String l, StringBuilder myBuilder) {
        //deleting preceding whitespaces
        int j = 0;
        while (j < myBuilder.length() && myBuilder.charAt(j) == ' ')
            myBuilder.deleteCharAt(j);

        StringBuilder build = new StringBuilder("");

        for (int i = 0; i < myBuilder.length(); i++) {
            char k = myBuilder.charAt(i);
            //returning the string if next character is a white space
            if (k == ' ') {
                return build.toString();
            } else {
                //if the character is not a digit and it isn't the first character, return the string
                if (!Character.isDigit(k) && i > 0) {
                    try {
                        double x = Double.parseDouble(build.toString());
                        return x + "";
                    } catch (Exception e) {
                        return "0";

                    }

                }
                //if the character is a digit, add it
                build.append(k);
            }


        }

        return build.toString();
    }

    public int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        if (s.length() == 0) return 0;

        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        if (i >= s.length()) return 0;

        char c = s.charAt(i);
        if ((c == '+' || c == '-')) {
            sign = c == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            boolean maxReached = result > Integer.MAX_VALUE / 10;

            int cvalue = Character.getNumericValue(s.charAt(i));
            boolean willOverflow = result == Integer.MAX_VALUE / 10 && cvalue > Integer.MAX_VALUE % 10;

            if (willOverflow || maxReached)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + cvalue;
            i++;
        }


        return result * sign;
    }

    public int myAtoi2(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        char[] letters = str.toCharArray();

        long result = 0;

        boolean isNegative = false;
        // The following boolean symbolEncountered will handle inputs like "--2891" or "-+189"
        boolean symbolEncountered = false;
        boolean numbersStarted = false;
        for (int i = 0; i < letters.length; ++i) {
            char c = letters[i];

            if (!Character.isDigit(c)) {
                if (numbersStarted) {
                    break;
                }

                if (c == '-') {
                    if (symbolEncountered) {
                        return 0;
                    }
                    isNegative = true;
                    numbersStarted = true;
                    symbolEncountered = true;
                    continue;
                }
                if (c == '+') {
                    if (symbolEncountered) {
                        return 0;
                    }
                    numbersStarted = true;
                    symbolEncountered = true;
                    continue;
                }
                if (c == ' ') {
                    if (!numbersStarted) {
                        continue;
                    }
                }

                return 0;
            }

            numbersStarted = true;
            int numLetter = Character.getNumericValue(c);
            result = result * 10 + numLetter;

            if (isNegative && result > Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        if (isNegative) {
            result = result * -1;
        }

        return (int) result;
    }
}
