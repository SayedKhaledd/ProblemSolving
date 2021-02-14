package ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/L
import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        long sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}
