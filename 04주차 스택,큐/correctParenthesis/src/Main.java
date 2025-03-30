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
        // char 형으로 만든 stack에 s 괄호들 저장
        for (char c : s.toCharArray()) {
            // 현재 c가  '('면 괄호 시작이므로 넣기
            if (c == '(') {
                stack.push(c);
            }
            // 현재 c가 ')'면서 stack이 비어있지 않으면 stack의 top 값을 조회하기 -> top이 '('면 둘 다 빼기
            if (c == ')' && !stack.isEmpty()) {
                if (stack.peek() == '(') {
                    stack.push(c);
                    stack.pop();
                    stack.pop();
                }
            }

        }
        // 괄호가 다 빠져나가면 비어있으므로 answer = true, 그렇지 않으면 false로 변환
        if (stack.isEmpty()) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}