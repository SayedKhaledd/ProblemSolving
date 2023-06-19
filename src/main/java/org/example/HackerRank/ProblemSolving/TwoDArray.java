package org.example.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               int x=(arr[i][j]+arr[i][j+1]+ arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
               arrayList.add(x);
            }

        }
        System.out.println( getMax(arrayList));

    }


    public static int getMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) max = arr.get(i);

        }
        return max;
    }
}
