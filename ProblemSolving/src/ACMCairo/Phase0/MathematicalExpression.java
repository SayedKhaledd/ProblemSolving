package ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/W

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * didn't submit yet
 */
public class MathematicalExpression {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int a = bufferedReader.read() - 48;
        bufferedReader.read();
        char s = (char) bufferedReader.read();
        bufferedReader.read();

        int b = bufferedReader.read() - 48;
        bufferedReader.read();

        char q = (char) bufferedReader.read();
        bufferedReader.read();

        int c = bufferedReader.read() - 48;
        //System.out.println(a+" "+s+" "+b+" "+q+" "+c);
        switch (s) {
            case '+':
                if (a + b == c) System.out.println("Yes");
                else System.out.println(a + b);
                break;
            case '-':
                if (a - b == c) System.out.println("Yes");
                else System.out.println(a - b);
                break;
            case '*':
                if (a * b == c) System.out.println("Yes");
                else System.out.println(a * b);
                break;
            case '/':
                if (a / b == c) System.out.println("Yes");
                else System.out.println(a / b);
                break;


        }

    }
}
