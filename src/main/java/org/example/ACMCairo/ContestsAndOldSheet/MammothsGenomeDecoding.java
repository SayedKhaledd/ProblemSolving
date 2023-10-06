package org.example.ACMCairo.ContestsAndOldSheet;

import java.util.Scanner;

;

public class MammothsGenomeDecoding {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String s = scan.next();
        if (t % 4 != 0) {
            System.out.println("===");
        } else {
            int needed = t / 4;
            int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;
            char c[] = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'A') counter1++;
                if (c[i] == 'C') counter2++;
                if (c[i] == 'G') counter3++;
                if (c[i] == 'T') counter4++;


            }
            if (counter1 > needed || counter2 > needed || counter3 > needed || counter4 > needed) {

                System.out.println("===");

            } else {
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == '?') {
                        if (counter1 < needed) {
                            c[i] = 'A';
                            counter1++;
                        } else if (counter2 < needed) {
                            c[i] = 'C';
                            counter2++;

                        } else if (counter3 < needed) {
                            c[i] = 'G';
                            counter3++;

                        } else if (counter4 < needed) {
                            c[i] = 'T';
                            counter4++;

                        }

                    }

                }
                System.out.println(String.valueOf(c));

            }
        }


    }

}