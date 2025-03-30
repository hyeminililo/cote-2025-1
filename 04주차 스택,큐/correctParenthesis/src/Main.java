import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.solution("(()())");
        System.out.println(solution.solution("(()())"));
    }
}

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean answer = true;
//
//        stack.push(s); // -> 이렇게 하면 문자열 전체가 들어가게 됨.
//        System.out.println(stack);
//        String a = stack.pop();
//        System.out.println("last one " + a);
        Iterator<Character> i = stack.iterator();

        for( char c :s.toCharArray() ) {
            stack.push(c);

        }
System.out.println(stack);

// 이거 queue 함수 사용,,? 안하고 다음부터 큐에 넣는것만 함수 사용해도될듯?
        if (s.startsWith(")")) {
            answer = false;
            return answer;
        }
        // i 요소에 접근하는 것이 앞부터인지 뒤부터인지 모르겠다.
//        while (i.hasNext()) {

            //  stack.push(i.next());
        //}
//System.out.println(stack);
        //  System.out.println(stack);
//        while (i.hasNext()) {
//            stack.push(i.next());
//        }

        //     System.out.println(stack);
        return answer;
    }
}