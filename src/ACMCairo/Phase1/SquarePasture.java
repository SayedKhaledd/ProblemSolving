package ACMCairo.Phase1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=663
public class  SquarePasture {
    public static void main(String[] args) throws IOException {
        ArrayList<String> input = new ArrayList<>();
        bufferReaderToList("src/ACMCairo/Phase1/squarepasture.in", input);
        int x1, y1, x2, y2;
        int l1, o1, l2, o2;
        String[] firstLine=input.get(0).split(" ");

        x1 = Integer.parseInt(firstLine[0]);
        y1 =Integer.parseInt(firstLine[1]);
        x2 = Integer.parseInt(firstLine[2]);
        y2 = Integer.parseInt(firstLine[3]);
        String[] secondLine=input.get(1).split(" ");

        l1 = Integer.parseInt(secondLine[0]);
        o1 = Integer.parseInt(secondLine[1]);
        l2 =Integer.parseInt(secondLine[2]);
        o2 = Integer.parseInt(secondLine[3]);
        int length, x, y;
        int[] arrX = {x1, x2, l1, l2};
        int maxXs = getMax(arrX);
        int minXs = getMin(arrX);
        x = maxXs - minXs;

        int[] arrY = {y1, y2, o1, o2};
        int maxYs = getMax(arrY);
        int minYs = getMin(arrY);
        y = maxYs - minYs;
        length = Math.max(x, y);
        System.out.println(length * length);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
        out.write(length * length + "");
        out.close();
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];

        }
        return max;

    }

    public static int getMin(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];

        }
        return min;
    }

    private static List<String> bufferReaderToList(String path, List<String> list) {
        try {
            final BufferedReader in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8));
            String line;
            while ((line = in.readLine()) != null) {
                list.add(line);
            }
            in.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
