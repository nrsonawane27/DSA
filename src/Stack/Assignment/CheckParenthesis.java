package Stack.Assignment;

import java.util.Stack;

public class CheckParenthesis {

    static boolean validParenthesis (String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            } else {
                if(! s.empty()) {
                    char x = s.peek();
                    if((x == '{' && ch == '}') || (x == '(' && ch == ')') || (x == '[' && ch == ']')) {
                        s.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return s.empty();
    }

    public static void main(String[] args) {
//        String str = "{([(){}])}";
//        String str = "{([()}])}";
//        String str = "{([(){}])}{[(";
//        String str = "{([(){}])}])";
        String str = "()";

        if(validParenthesis(str)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
