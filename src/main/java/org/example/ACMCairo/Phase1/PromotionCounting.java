package ACMCairo.Phase1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * not yet
 */

//http://www.usaco.org/index.php?page=viewproblem2&cpid=591
public class PromotionCounting {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        bufferReaderToList("", input);

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
