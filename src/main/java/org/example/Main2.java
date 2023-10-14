package org.example;

import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws IOException {
//        List<String> arenaNames = new ArrayList<>();
//        Document document = Jsoup.connect("https://en.wikipedia.org/wiki/National_Basketball_Association").get();
//        Element table = document.getElementsByTag("tbody").get(3);
//        Elements rows = table.children();
//        for (int i = 1; i < rows.size(); i++) {
//            Element row = rows.get(i);
//            Elements rowData = row.getElementsByTag("td");
//            if (!rowData.isEmpty()) {
//                if (rowData.size() < 5)
//                    continue;
//                if (i > 1 && rows.get(i - 1).getElementsByTag("td").size() > 1 && rows.get(i - 1).getElementsByTag("td").get(1).hasAttr("rowspan")) {
//                    String s = rowData.get(1).text();
//                    arenaNames.add(s);
//
//                } else {
//                    String s = rowData.get(2).text();
//                    arenaNames.add(s);
//
//                }
//
//            }
//        }
//
//        arenaNames.forEach(System.out::println);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a three-digit integer: ");
//        int n = input.nextInt();
//
//        int firstDigit = n % 10;
//        int thirdDigit = n / 100;
//
//        if (firstDigit == thirdDigit)
//            System.out.println(n + " is a palindrome");
//        else
//            System.out.println(n + " is not a palindrome");

        //for

//        for (int i = 0; ; i++) {
//            int number = input.nextInt();
//            if (number == 2)
//                continue;
//            System.out.println(number);
//            if (number == 0)
//                break;
//        }

        //printing number 1 - 5
//
//        for (int i = 1; i <= 5; i++) {
//            if (i == 5)
//                System.out.print(i);
//            else
//                System.out.println(i);
//        }
//
//
//        //while
//
//        int i = 1;
//        while (i <= 5) {
//            if (i == 5)
//                System.out.print(i);
//            else
//                System.out.println(i);
//            i++;
//        }
//
//        //do while
//        i = 1;
//        do {
//            if (i == 5)
//                System.out.print(i);
//            else
//                System.out.println(i);
//            i++;
//        } while (i < 0);
//
//
//        char c='a';
        /*
        0 1

       input  0
       unicode 48
       binary number 001001

      48 58
      65 A 66 B
      97 a 98 b

        /
         */

//        long l= input.nextLong();


//        String s = input.next();
//
//
//        boolean check = true;
//
//        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
//            if (s.charAt(i) != s.charAt(j)) {
//                check = false;
//                break;
//            }
//        }
//
//        if (check)
//            System.out.println("plandriom");
//        else
//            System.out.println("not plandrom");


        int varX = 8, varY = 9;

        //hello "world"


        int x = 1231243123, y=123123123;
        System.out.printf("%-10d %d", x,y);


    }
}
