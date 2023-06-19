package SheetMostafaSaad.A;

import java.util.Scanner;

//https://codeforces.com/contest/791/problem/A
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
       int counter=0;
        while(a<=b){
            a*=3;
            b*=2;
            counter++;
        }
        System.out.println(counter);
    }
}
