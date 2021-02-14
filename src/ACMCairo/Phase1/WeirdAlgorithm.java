package ACMCairo.Phase1;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
       while(true){
           System.out.print(n);
           if(n==1)break;
           if(n%2==0){
               n/=2;
           }
           else{
               n*=3;
               n++;
           }
           System.out.print(" ");
       }
    }
}
