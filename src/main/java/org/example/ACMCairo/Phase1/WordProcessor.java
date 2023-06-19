package org.example.ACMCairo.Phase1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    public static void main(String[] args) throws IOException {

        ArrayList<String> input = new ArrayList<>();
        bufferReaderToList("file word.in", input);
        String[] firstLine = input.get(0).split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        String[] secondLine = input.get(1).split(" ");

        StringBuilder output = new StringBuilder("");
        int size = 0;
        for (int i = 0; i < secondLine.length; i++) {
            if (size + secondLine[i].length() > k) {
                output.append("\n");
                output.append(secondLine[i]);
                size = secondLine[i].length();
            } else {
                if(i!=0)
                output.append(" ");
                output.append(secondLine[i]);
                size += secondLine[i].length();
            }
            System.out.println(size);

        }
        System.out.println("Output is :");
        System.out.println(output);

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("file word.out")));
        out.write(output.toString());
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
