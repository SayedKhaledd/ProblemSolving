package ACMCairo.Phase0;

import java.util.Scanner;

public class Log2n {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        n=(long)(Math.log10(n)/Math.log10(2));
        System.out.println(n);
    }





}
