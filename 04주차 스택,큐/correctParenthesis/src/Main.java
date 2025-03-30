import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(")((())"));
    }
}

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean answer = true;

        if (s.startsWith(")")) {
            answer = false;
            return answer;
        }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);

            }
            if (c == ')' && !stack.isEmpty()) {
                if (stack.peek() == '(') {
                    stack.push(c);
                    stack.pop();
                    stack.pop();
                }
            }

        }

        if (stack.isEmpty()) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}