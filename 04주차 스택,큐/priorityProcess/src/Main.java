import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution.solution(priorities, location));

    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int matchIndex = 0 ;

        // 큐 생성
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            queue.add(new int[]{priorities[i], i }); // queue([2,0],[1,1],[3,2],[2,3])
        }
        while(!queue.isEmpty()){
            boolean isPriority = false;
            int[] currentElement = queue.poll();

            for(int[] p : queue){
                // 첫번째 요소보다 큰 우선순위가 있는지 확인 있으면 boolean 값 변경
                if(p[0] > currentElement[0] ){
                    isPriority = true;
                    break;
                }
            }
            // isPriority가 true면 뒤로 보내기
            if(isPriority){
                queue.add(currentElement);

                continue;
            }
            matchIndex++;
            if (currentElement[1] == location) {
                answer = matchIndex;
                return answer;
            }
        }

        return answer;
    }
}