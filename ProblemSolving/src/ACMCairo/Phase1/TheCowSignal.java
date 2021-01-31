package ACMCairo.Phase1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


//http://www.usaco.org/index.php?page=viewproblem2&cpid=665

import java.io.IOException;
import java.util.List;


public class TheCowSignal {
    public static void main(String[] args) throws IOException {


        ArrayList<String> allInput = new ArrayList<>();

        bufferReaderToList("cowsignal.in", allInput);

        String input = allInput.get(0);
        int m = 0, k = 0;

        String[] strings = input.split(" ");
        m = Integer.parseInt(strings[0]);
        k = Integer.parseInt(strings[2]);
        allInput.remove(0);


        StringBuilder mainOutput = new StringBuilder("");
        int counter0 = 0;
        for (int i = 0; i < m; i++) {
            StringBuilder line = new StringBuilder(allInput.get(i));
            for (int j = 0, counter = 0; j < line.length(); j++) {
                mainOutput.append(line.charAt(j));

                counter++;
                if (counter <= k - 1) {
                    j--;
                } else {
                    counter = 0;
                }
            }

            counter0++;
            if (counter0 <= k - 1) {
                i--;
            } else {
                counter0 = 0;
            }

            if (i != m - 1)
                mainOutput.append("\n");
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
        out.write(mainOutput.toString());
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
