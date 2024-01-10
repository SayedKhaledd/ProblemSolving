package org.example.leetcode.general;

public class KthSymbolInGrammar {
    //TODO: FINISH IT



    public static void main(String[] args) {
//        StringBuilder l=new StringBuilder("hello");
//        l.replace(1,2,"k");
//        System.out.println(l);
        System.out.println(kthGrammar(20, 1));
    }

    public static int kthGrammar(int n, int k) {
        StringBuilder[] arr = new StringBuilder[n];
        arr[0] = new StringBuilder("0");

        for (int i = 1; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i - 1]);
            for (int j = 0; j < arr[i].length(); j += 2) {
                if (arr[i].charAt(j) == '0')
                    arr[i].replace(j, j + 1, "01");

                else
                    arr[i].replace(j, j + 1, "10");


            }
        }
        return arr[n - 1].charAt(k - 1) - 48;
    }
}
