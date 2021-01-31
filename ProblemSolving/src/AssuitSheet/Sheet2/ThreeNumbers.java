package AssuitSheet.Sheet2;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Z
public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int s = scan.nextInt();
        int counter = 0;

        for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                if(i+j==s){
                    counter++;
                }
                 else if((s-(i+j))<=k && (s-(i+j))>=0 ){

                    counter++;
                }

            }
        }

        System.out.println(counter);
    }
}
