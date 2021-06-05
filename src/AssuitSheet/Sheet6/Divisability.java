package AssuitSheet.Sheet6;

import java.util.Scanner;

public class Divisability {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();
        long x = scan.nextLong();
//swapping
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        long n;
//getting the value of n
        if (a % x == 0)
            n = (b / x) - (a / x) + 1;
        else
            n = (b / x) - (a / x);


        if (x > b)
            System.out.println(0);
        else {
            //if they are equal
            if (a == b) {
                if (a % x != 0)
                    System.out.println(0);
                else
                    System.out.println(a);
            }
            //if a isn't divisible by x
            else {
                if (a % x != 0) {
                    a += x - (a % x);
                }

                long sum = (long) (0.5 * n * (2 * a + (n - 1) * x));
                System.out.println(sum);

            }
        }
    }
}
