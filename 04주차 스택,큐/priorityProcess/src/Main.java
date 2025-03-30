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
        int matchIndex = 0 ;
        boolean isPriority = false;
        // 큐 생성
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            queue.add(new int[]{priorities[i], i }); //queue([2,0],[1,1],[3,2],[2,3])
        }
        while(!queue.isEmpty()){
            int[] currentElement = queue.poll();

            for(int[] p : queue){
                if(p[0] > currentElement[0] ){
                    isPriority = true;
                    break;
                }
            }

        }
        System.out.println(isPriority);
        return answer;
    }
}