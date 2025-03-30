import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        solution.solution(priorities, location);
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 큐 생성
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            queue.add(new int[]{priorities[i], i });
        }
        for (int[] process : queue) {
            System.out.println("priority: " + process[0] + ", index: " + process[1]);
        }
        return answer;
    }
}