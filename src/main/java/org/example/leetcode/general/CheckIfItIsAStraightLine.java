package leetcode.general;

public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        int[][] arr = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        System.out.println(checkStraightLine(arr));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        double slope = (coordinates[1][1] - coordinates[0][1]) / ((double) coordinates[1][0] - coordinates[0][0]);
        boolean check = coordinates[0][0] == coordinates[1][0];
        for (int i = 1; i < coordinates.length - 1; i++) {
            if (coordinates[i][0] != coordinates[i + 1][0]) {
                check = false;
            }
            if (((coordinates[i + 1][1] - coordinates[i][1]) / ((double) coordinates[i + 1][0] - coordinates[i][0])) != slope && !check)
                return false;
        }

        return true;

    }
}
