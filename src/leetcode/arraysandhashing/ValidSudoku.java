package leetcode.arraysandhashing;

import java.util.Arrays;
//not yet
public class ValidSudoku {
    public static void main(String[] args) {
        //  printArr(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 0, 0, 2, 2);
        char[][] board = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.' },
                {'.', '4', '.', '3', '.', '.', '.', '.', '.' },
                {'.', '.', '.', '.', '.', '3', '.', '.', '1' },
                {'8', '.', '.', '.', '.', '.', '.', '2', '.' },
                {'.', '.', '2', '.', '7', '.', '.', '.', '.' },
                {'.', '1', '5', '.', '.', '.', '.', '.', '.' },
                {'.', '.', '.', '.', '.', '2', '.', '.', '.' },
                {'.', '2', '.', '9', '.', '.', '.', '.', '.' },
                {'.', '.', '4', '.', '.', '.', '.', '.', '.' }};
        ;
        char[][] board2 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.' },
                {'6', '.', '.', '1', '9', '5', '.', '.', '.' },
                {'.', '9', '8', '.', '.', '.', '.', '6', '.' },
                {'8', '.', '.', '.', '6', '.', '.', '.', '3' },
                {'4', '.', '.', '8', '.', '3', '.', '.', '1' },
                {'7', '.', '.', '.', '2', '.', '.', '.', '6' },
                {'.', '6', '.', '.', '.', '.', '2', '8', '.' },
                {'.', '.', '.', '4', '1', '9', '.', '.', '5' },
                {'.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board2));
    }

    public static boolean isValidSudoku(char[][] board) {
        if (!check(board, 0, 0, 8, 8, true)) {
            System.out.println("here");
            return false;
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!check(board, i, j, i + 2, j + 2, false)) {
                    System.out.println("here2");
                    return false;

                }
            }

        }
        return true;
    }

    public static boolean check(char[][] board, int start_row, int start_column, int end_row, int end_column, boolean check) {
        int[] freq = new int[10];
        for (int i = start_row; i <= end_row; i++) {
            for (int j = start_column; j <= end_column; j++) {
                if (board[i][j] == '.')
                    continue;
                else {
                    int x = board[i][j] - 48;
                    if (x > 0 && x < 10) {
                        freq[x]++;
                        if (freq[x] > 1) {
                            System.out.println("j is " + j + " and i is " + i);
                            return false;
                        }

                    } else
                        return false;
                }

            }
            if (check)
                Arrays.fill(freq, 0);

        }
        if (check)
            Arrays.fill(freq, 0);

        //checking columns
        for (int i = start_column; i <= end_column; i++) {
            for (int j = start_row; j <= end_row; j++) {
                if (board[j][i] == '.')
                    continue;
                else {
                    int x = board[j][i] - 48;
                    if (x > 0 && x < 10) {
                        freq[x]++;
                        if (freq[x] > 1) {
                            System.out.println("j is " + j + " and i is " + i);
                            return false;

                        }
                    } else
                        return false;
                }

            }
            if (check)
                Arrays.fill(freq, 0);

        }

        //checking box 3x3


        return true;
    }


    public static void printArr(int[][] arr, int start_column, int start_row, int end_column, int end_row) {
        for (int i = start_column; i <= end_column; i++) {
            for (int j = start_row; j <= end_row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
