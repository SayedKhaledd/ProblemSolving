package AssuitSheet;
/**
 * not yet
 */

import java.math.BigDecimal;
import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/326175/problem/D
public class AliBabaPuzzel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();
        long fakeResult;
        if (!check(a, b, c)) {
            System.out.println("NO");
        } else if ((a + b + c == d)) {
            fakeResult=a+b+c;
//            check2(a,b,c,fakeResult,'+','+');
        }
        else if (a + b - c == d) {

        }
        else if (a + b * c == d) {

        }
        else if (a - b - c == d) {

        }
        else if (a - b + c == d) {

        }
        else if (a - b * c == d) {

        }
        else if (a * b * c == d) {

        }
        else if (a * b - c == d) {

        }
        else if (a * b + c == d) {

        }
        else {

            System.out.println("NO");
        }

        System.out.println(34688642 + -851839419 + 395784949);
    }

    public static boolean check(long a, long b, long c) {
        return (a < Long.MAX_VALUE && b < Long.MAX_VALUE && c < Long.MAX_VALUE) &&
                (a + b < Long.MAX_VALUE) && (a + c < Long.MAX_VALUE) && (c + b < Long.MAX_VALUE)
                && (a + b + c < Long.MAX_VALUE)
                && (a * b < Long.MAX_VALUE) && (a * c < Long.MAX_VALUE) && (c * b < Long.MAX_VALUE) &&
                (a * b * c < Long.MAX_VALUE)
                ;
    }
}
