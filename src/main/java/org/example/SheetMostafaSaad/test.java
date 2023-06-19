package SheetMostafaSaad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Main.main(new String[]{});
    }

    public static int climbStairs(int n) {
        int[] arr = new int[45];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
        return arr[n - 1];
    }
}

class CollectionUtils {

    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        // write your code here
        for (String blackListedUser : blacklist) {
            phones.remove(blackListedUser);
        }
        return phones;
    }
}

/* Please, do not modify this I/O code */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
