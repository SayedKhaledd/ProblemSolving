import java.io.*;
import java.util.*;

public class Test {


    static int[][] left = new int[2][3];
    static int[][] middle_left = new int[3][4];
    static int[][] middle_right = new int[3][2];
    static int[][] right = new int[4][3];
    static int n = 30, counter = 0;

    public static void main(String[] args) throws IOException {
        //   int n = MyScanner.readInt();

        //TODO: aisle seats
        final int MAX_ROWS = Math.max(left.length, Math.max(middle_left.length, Math.max(middle_right.length, right.length)));
        for (int i = 0; i < MAX_ROWS; i++) {
            //the left seats
            if (i < left.length && counter < n)
                left[i][left[i].length - 1] = ++counter;

            //the middle left seats
            if (i < middle_left.length && counter < n) {
                middle_left[i][0] = ++counter;
            }
            if (i < middle_left.length && counter < n) {
                System.out.println(i);
                middle_left[i][middle_left[i].length - 1] = ++counter;
            }

            //the middle right seats
            if (i < middle_right.length && counter < n) {
                middle_right[i][0] = ++counter;
            }
            if (i < middle_right.length && counter < n) {
                middle_right[i][middle_right[i].length - 1] = ++counter;
            }

            //the right seats
            if (i < right.length && counter < n)
                right[i][0] = ++counter;


        }

        //TODO: window seats
        final int MAX_WINDOW_ROWS = Math.max(left.length, right.length);
        for (int i = 0; i < MAX_WINDOW_ROWS; i++) {
            if (i < left.length && counter < n)
                left[i][0] = ++counter;
            if (i < right.length && counter < n)
                right[i][right[i].length - 1] = ++counter;

        }

        //TODO: middle seats
        for (int i = 0; i < MAX_ROWS; i++) {
            //left seats
            if (i < left.length)
                printMiddleSeats(left, i);

            //middle left seats
            if (i < middle_left.length)
                printMiddleSeats(middle_left, i);

            //middle right seats
            if (i < middle_right.length)
                printMiddleSeats(middle_right, i);
            //right seats
            if (i < right.length)
                printMiddleSeats(right, i);


        }


        printSeats();


    }

    public static void printMiddleSeats(int[][] arr, int i) {
        for (int j = 1; j < arr[i].length - 1 && counter < n; j++) {
            if (arr[i][j] != 0)
                break;
            else
                arr[i][j] = ++counter;
        }
    }

    public static void printSeats() {
        System.out.println("left seats");
        print2DArray(left);

        System.out.println("middle left seats");
        print2DArray(middle_left);

        System.out.println("middle right seats");
        print2DArray(middle_right);

        System.out.println("right seats");
        print2DArray(right);

    }

    public static void print2DArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

}
