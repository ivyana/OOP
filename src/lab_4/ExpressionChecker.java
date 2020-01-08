package lab_4;

import java.util.Stack;

public class ExpressionChecker {
    static private Stack<String> stack;

    static boolean expressionIsLegal(String givenExpression) {
        stack = new Stack<>();
        for (int i = 0; i < givenExpression.length(); i++) {
            char parenthesis = givenExpression.charAt(i);
            if (parenthesis == '(') {
                stack.push(String.valueOf(parenthesis));
            } else if (parenthesis == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.empty();
    }
}
