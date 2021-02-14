package AssuitSheet;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/U
public class FloatOrInt {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double x=scan.nextDouble();


            System.out.println((x==(int)x?"int":"float")+x);

    }
}
