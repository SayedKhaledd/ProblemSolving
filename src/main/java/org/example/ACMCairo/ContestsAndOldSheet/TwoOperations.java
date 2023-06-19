package ACMCairo.ContestsAndOldSheet;
//https://codeforces.com/gym/102263/problem/M

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoOperations {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));

        }

        boolean check = true;
        while (check) {
            check = false;
            characters.sort(Character::compareTo);

            for (int i = 0; i < characters.size() - 1; i++) {
                if (characters.get(i) == characters.get(i + 1) && characters.get(i) != 'z') {
                    characters.set(i, (char) (characters.get(i) + 1));
                    characters.remove(i + 1);


                    check = true;
                }
            }

        }
        for (int i = characters.size() - 1; i >= 0; i--) {
            System.out.print(characters.get(i));
        }


    }


}
