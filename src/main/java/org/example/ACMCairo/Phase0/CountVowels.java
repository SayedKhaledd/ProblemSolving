package ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/I
public class CountVowels {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        int counter=0;
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);

            if(c=='a' || c=='A'|| c=='e'|| c=='E'|| c=='i' || c=='I' || c=='o' || c=='O' || c=='u' ||c=='U'){
                counter++;
            }

        }
        System.out.println(counter);

    }
}
