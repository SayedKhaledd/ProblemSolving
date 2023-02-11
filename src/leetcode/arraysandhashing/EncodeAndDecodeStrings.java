package leetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.List;
//not yet
public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("w::::::e:");
        arr.add("s:a:;y");
        arr.add(":");
        arr.add("yes");
        System.out.println(arr.toString());
        String s = encode(arr);
        System.out.println(s);
        System.out.println(decode(s));

    }

    public static String encode(List<String> strs) {

        StringBuilder s = new StringBuilder("");

        for (int i = 0; i < strs.size(); i++) {
            if (i == strs.size() - 1) {
                s.append(strs.get(i));
            } else if (strs.get(i).equals(":")) {
                s.append(strs.get(i) + "::;");
            }

            else if (strs.get(i).contains(":") && strs.get(i).lastIndexOf(":")==strs.get(i).length()-1) {

                    s.append(strs.get(i) + "::;");

            } else {
                s.append(strs.get(i) + ":;");
            }
        }
        return s.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (i < str.length() - 1 && str.charAt(i) == ':' && str.charAt(i + 1) == ';') {
                arr.add(s.toString());
                s = new StringBuilder("");
                i++;
            } else if (i < str.length() - 1 && str.charAt(i) == ':' && str.charAt(i + 1) == ':') {
                s.append(str.charAt(i));
                i++;
            } else if (i == str.length() - 1) {
                s.append(str.charAt(i));
                arr.add(s.toString());
            } else {
                s.append(str.charAt(i));
            }
        }
        return arr;
    }
}
