package general;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Valid_curly_brackets {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr=='(') {
                stack.push(curr);
            } else if (curr==')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String args[]) {
        general.Valid_curly_brackets vp = new general.Valid_curly_brackets();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(vp.isValid(str));

        sc.close();
    }
}
