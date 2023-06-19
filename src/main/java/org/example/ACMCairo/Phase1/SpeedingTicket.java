package ACMCairo.Phase1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * not yet
 */
public class SpeedingTicket {

    public static void main(String[] args) throws IOException {

        ArrayList<String> arr = new ArrayList<>();
        bufferReaderToList("file speeding.in", arr);
        String[] firstLine = arr.get(0).split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int[][] roadSegments = new int[n][2];
        int[][] bessieSegments = new int[m][2];

        for (int i = 1, j = 0; i <= n; i++, j++) {
            String[] lineI = arr.get(i).split(" ");
            roadSegments[j][0] = Integer.parseInt(lineI[0]);
            roadSegments[j][1] = Integer.parseInt(lineI[1]);

        }
        for (int i = n + 1, j = 0; i <= n + m; i++, j++) {
            String[] lineI = arr.get(i).split(" ");
            bessieSegments[j][0] = Integer.parseInt(lineI[0]);
            bessieSegments[j][1] = Integer.parseInt(lineI[1]);

        }
        int max = 0;
        for (int i = 0, j = 0; i < roadSegments.length; j++, i++) {
            if (bessieSegments[j][0] == 0) continue;

            if (roadSegments[i][1] < bessieSegments[j][1]) {
                int x = bessieSegments[j][1] - roadSegments[i][1];
                if (x > max) max = x;

            }
            if (roadSegments[i][0] > bessieSegments[j][0]) {

                bessieSegments[j][1] = bessieSegments[j + 1][1];
                int diff = roadSegments[i][0] - bessieSegments[j][0];
                if (diff < bessieSegments[j + 1][0]) {
                    bessieSegments[j + 1][0] -= diff;
                    bessieSegments[j][0] = roadSegments[i][0];
                } else {
                    bessieSegments[j][0] += bessieSegments[j + 1][0];
                    bessieSegments[j + 1][0] = 0;

                }
                i--;
                j--;
            }


        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("file speeding.out")));
        out.write(max);
        out.close();

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
