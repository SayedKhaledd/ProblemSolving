package leetcode.general;

import java.util.HashMap;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flower", "flower"};
//        System.out.println(longestCommonPrefix3(strs));
        int x= new Scanner(System.in).nextInt();
        int y=new Scanner(System.in).nextInt();;
        System.out.println(x/y);
    }

    //solution 1

    /**
     * Runtime  1 ms Beats 79.69% Memory 41.1 MB Beats 24.21%
     */
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            String pre = "";
            if (strs[i].length() < prefix.length()) {
                pre = prefix.substring(0, strs[i].length());
            } else
                pre = prefix.toString();
            if (pre.equals(strs[i]))
                prefix = new StringBuilder(pre);
            else {
                int index = common(strs[i], pre);
                if (index == -1)
                    return "";
                else
                    prefix = new StringBuilder(pre.substring(0, index + 1));
            }

        }


        return prefix.toString();
    }

    public static int common(String a, String b) {
        int index = -1;

        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                index = i;
            } else break;
        }
        return index;
    }

    //Solution 2

    /**
     * Runtime  1 ms Beats 79.69% Memory 40.8 MB Beats 50.5%
     */
    public static String longestCommonPrefix2(String[] strs) {
        int min = getMin(strs);
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            boolean check = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result.append(c);
            } else
                break;

        }
        return result.toString();

    }

    public static int getMin(String[] strs) {
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min)
                min = strs[i].length();
        }
        return min;
    }

    //solution 3
    //not working yet
    public static String longestCommonPrefix3(String[] strs) {
        TrieTree<Character> trieTree = new TrieTree<>();
        for (String str : strs)
            trieTree.addElements(str.chars().mapToObj(c -> (char) c).toArray(Character[]::new));
        TrieTree.TrieNode<Character> root = trieTree.getRoot();
        StringBuilder result = new StringBuilder();
        System.out.println(trieTree);
//        System.out.println(root.getChildren());
        while (root != null && root.getChildren() != null && root.hasChildren()) {
            char c;
            System.out.println(root.getChildren().size());
            if (root.getChildren().size() == 1) {
                result.append(root.getChildren().keySet().toArray()[0]);
                c = result.charAt(result.length() - 1);
            } else {
                System.out.println("breaked");
                break;

            }
            System.out.println("char c is " + c);
            System.out.println("while result is " + result);
            root = root.getChildren().get(c);
        }

        return result.toString();

    }
}


class TrieTree<E> {
    private TrieNode<E> root;

    static class TrieNode<E> {
        E element;
        HashMap<E, TrieNode<E>> children;

        public TrieNode() {
            children = new HashMap<>();
        }

        public TrieNode(E element) {
            this.element = element;
        }

        public boolean hasChildren() {
            return children.size() != 0;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public HashMap<E, TrieNode<E>> getChildren() {
            return children;
        }

        public void setChildren(HashMap<E, TrieNode<E>> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            return "\n\nTrieNode{" +
                    "element=" + element +
                    "\n, children=\n" + children +
                    '}';
        }
    }

    public TrieTree() {
        root = new TrieNode<>();
    }

    public TrieNode<E> getRoot() {
        return root;
    }

    public void setRoot(TrieNode<E> root) {
        this.root = root;
    }

    public void addElements(E[] data) {
        TrieNode<E> current = root;
        for (E element : data) {
            TrieNode<E> newTrieNode = new TrieNode<>(element);
            if (current.getChildren() == null) {
                current.setChildren(new HashMap<>());
                current.getChildren().put(element, newTrieNode);
                current = newTrieNode;


            } else {
                if (current.getChildren().get(element) == null) {
                    current.getChildren().put(element, newTrieNode);
                    current = newTrieNode;
                }
            }
        }
    }

    @Override

    public String toString() {
        return "TrieTree{" +
                "root=" + root.toString() +
                '}';
    }
}

