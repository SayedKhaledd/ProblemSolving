package HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/permutation-equation/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceEquation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){

            a[i]=scan.nextInt();
        }


        for(int i=1;i<=a.length;i++){
            int x=search(a,i)+1;
            //  System.out.println(x);
            int y=search(a,x)+1;
            System.out.println(y);
        }



    }


    public static int search(int[] a, int key){

        for(int i=0;i<a.length;i++){
            if(a[i]==key)
                return i;

        }
        return -1;

    }
}

