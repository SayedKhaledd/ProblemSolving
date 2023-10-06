package org.example.hackerrank.problemsolving;
//https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.io.IOException;
import java.util.Scanner;

public class CircularArrayRotation {


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int k = scan.nextInt();
        int n2 = scan.nextInt();
        int[] m = new int[n2];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            m[i] = scan.nextInt();
        }

/*for(int j=0;j<k;j++){
int temp=arr[0];
 arr[0]=arr[n-1];
 for(int i=n-2;i>0;i--){
     arr[i+1]=arr[i];
 }
 arr[1]=temp;

}*/
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            if (i + k < n) {
                l[i + k] = arr[i];
            } else if (i + k >= n) {
                int x = (i + k) % n;
                l[x] = arr[i];
            }
        }
        for (int i = 0; i < n2; i++)
            System.out.println(l[m[i]]);
    }
}

