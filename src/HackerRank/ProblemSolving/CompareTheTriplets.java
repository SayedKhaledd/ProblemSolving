package HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/compare-the-triplets/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static int[] compareTriplets(int[] a, int[] b) {
        int[] c=new int[2];
        int counter1=0,counter2=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i])
                counter1++;
            else if(a[i]<b[i]){
                counter2++;


            }
        }
        c[0]=counter1;
        c[1]=counter2;
        return c;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];

        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
        }
        for(int j=0;j<3;j++){
            b[j]=scan.nextInt();

        }
        int c[]=compareTriplets(a,b);
        System.out.print(c[0]+" "+c[1]);
    }

}
