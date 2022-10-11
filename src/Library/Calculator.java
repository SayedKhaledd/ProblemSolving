package Library;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Calculator {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(infixToPostFix(deleteSpaces(s)));
    }

    public static int getPrecedence(char c) {
        switch (c) {
            case '-':
            case '+':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostFix(String exp) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '.') {
                result += c;
            } else if (c == '(')
                stack.push('(');
            else if (c == '^')
                stack.push('^');
            else if (c == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                if (!stack.empty() && getPrecedence(c) > getPrecedence(stack.peek()))
                    stack.push(c); //push if precedence is high
                else {
                    result += " ";
                    while (!stack.empty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                        result += stack.pop();

                    }
                    stack.push(c);
                }
            }

        }

        while (!stack.empty()) {
            result += stack.pop();

        }
        return result;
    }

    public static String deleteSpaces(String s) {
        String k = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                k += s.charAt((i));
            }
        }
        return k;
    }
}
