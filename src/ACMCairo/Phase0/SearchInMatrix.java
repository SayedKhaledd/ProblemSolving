package ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S
public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        int x=scan.nextInt();
        System.out.println(searchMatrix(arr,x)?"will not take number":"will take number");


    }

    public static boolean searchMatrix(int[][] arr, int val){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==val)return true;
            }
        }
    return false;
    }
}
