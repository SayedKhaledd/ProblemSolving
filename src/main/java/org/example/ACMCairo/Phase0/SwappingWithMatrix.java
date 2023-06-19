package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223205/problem/I
public class SwappingWithMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x= scan.nextInt();
        int y=scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= scan.nextInt();
            }
        }

        swapRows(arr,x,y);
        swapCol(arr,x,y);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void swapRows(int[][] arr, int x, int y){

        int[] arrXRow=new int[arr.length];
        int[] arrYRow=new int[arr.length];


        for(int i=0;i<arr.length;i++){
            arrXRow[i]=arr[x-1][i];

        }
        for(int i=0;i<arr.length;i++){
            arrYRow[i]=arr[y-1][i];

        }

        for(int i=0;i<arr.length;i++){
            arr[x-1][i]=arrYRow[i];
        }
        for(int i=0;i<arr.length;i++){
           arr[y-1][i]=arrXRow[i];

        }



    }
    public static void swapCol(int[][] arr, int x, int y){
        int[] arrXCol=new int[arr.length];
        int[] arrYCol=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arrXCol[i]=arr[i][x-1];

        }
        for(int i=0;i<arr.length;i++){
            arrYCol[i]=arr[i][y-1];

        }
        for(int i=0;i<arr.length;i++){
            arr[i][x-1]=arrYCol[i];

        }
        for(int i=0;i<arr.length;i++){
            arr[i][y-1]=arrXCol[i];

        }


    }
}
