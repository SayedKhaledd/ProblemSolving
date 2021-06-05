package AssuitSheet.Sheet6;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/C
public class SumOfRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;

        }
        long sumsmall = (long) ((a - 1) * (a) / 2L);
        long sumbig = (long) ((b) * (b + 1) / 2L);

        long sumAll = sumbig - sumsmall;

        long sumevensmall = (long) (2L * ((a / 2L ) * (a / 2L+1L) / 2L));
        long sumevenbig = (long) (2L * ((b / 2L) * (b / 2L + 1L) / 2L));
        long sumeven = sumevenbig - sumevensmall;
        if(a%2==0)sumeven+=a;
        long sumodd = sumAll - sumeven;
        System.out.println(sumAll);
        System.out.println(sumeven);
        System.out.println(sumodd);


    }

}
