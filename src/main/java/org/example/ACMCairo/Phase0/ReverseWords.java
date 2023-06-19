package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//
public class ReverseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String k = scan.nextLine();

        StringBuilder gen = new StringBuilder("");

            StringBuilder s = new StringBuilder("");
            for (int j = 0; j <= k.length(); j++) {
                if(j==k.length() || k.charAt(j)==' '){
                    s.reverse();
                    gen.append(s);
                    if(j!=k.length())
                    gen.append(" ");

                    s = new StringBuilder("");
                }
                else  {
                    s.append(k.charAt(j));
                }
            }





        System.out.println(gen.toString());
    }

}
