package org.example.Library;

public class SimpsonThirdRule {
    public static void main(String[] args) {
        double n = 8, a = 12, b = 8;
        double result = 0, odds = 0, evens = 0, f0 = 0, fn = 0;
        for (double i = a, j = 0; i >= b; i -= 0.5, j++) {

            System.out.print(j + "      " + i + "             ");
            double f = functionValue(i);
            System.out.printf("%10.6f\n", f);
            if (j % 2 == 0 && j != 0 && j != n) {
                evens += f;
            } else if (j % 2 != 0 && j != 0 && j != n) {
                odds += f;
            } else if (j == 0) {
                f0 = f;
            } else if (j == n) {
                fn = f;
            }
        }
        result = 0.5 / 3 * (f0 + 4 * odds + 2 * evens + fn);
        System.out.println(result);

    }

    public static double functionValue(double i) {
        return 5.0 / (-i * Math.sqrt(i));
    }
}
