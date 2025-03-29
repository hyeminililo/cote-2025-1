public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.solution("(()())");
        System.out.println(solution.solution("(()())"));
    }
}


class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if (s.startsWith(")")) {
            answer = false;
            return answer;
        }


        return answer;
    }
}