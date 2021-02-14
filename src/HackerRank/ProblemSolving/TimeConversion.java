package HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/time-conversion/problem
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        StringBuilder ss=new StringBuilder(s);
        int x=(ss.charAt(0)-48)*10 +(ss.charAt(1)-48);
        if(s.charAt(8)=='P'){
            if(x!=12) {


                x = (x + 12);
                ss.deleteCharAt(0);
                ss.deleteCharAt(0);
                ss.insert(0, x + "");
            }
        }
        else if (s.charAt(8)=='A' && x==12){
            x = 0;
            ss.deleteCharAt(0);
            ss.deleteCharAt(0);
            ss.insert(0, x + "");
            ss.insert(0, x + "");

        }

        ss.deleteCharAt(8);
        ss.deleteCharAt(8);
        return ss.toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
