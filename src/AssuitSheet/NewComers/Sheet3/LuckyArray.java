package AssuitSheet.NewComers.Sheet3;

import java.util.Scanner;



//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/J
public class LuckyArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[100001];
        int[] arrNegative = new int[100001];
        int min = 1000000;

        for (int i = 0; i < n; i++) {
            int x=scan.nextInt();
            if(x<min){
                min=x;
            }
            if(x<0){
                arrNegative[x*-1]++;
            }
            else
            arr[x]++;
        }

        if(min>=0)
        System.out.println(arr[min]%2!=0?"Lucky":"Unlucky");
        else
            System.out.println(arrNegative[min*-1]%2!=0?"Lucky":"Unlucky");

        /**
         * solution 2
         */

//            Scanner scan=new Scanner(System.in);
//            int n= scan.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i< arr.length;i++){
//                arr[i]= scan.nextInt();
//            }
//            int counter=1,smallest=arr[0];
//            for(int i=1;i<arr.length;i++){
//                if(arr[i]<smallest){
//                    smallest=arr[i];
//                    counter=1;
//                }
//                else if(arr[i]==smallest){
//                    counter++;
//
//                }
//
//
//            }
//            System.out.println(counter%2!=0?"Lucky":"Unlucky");
//
//
//
//        }
//    }

    }


}
