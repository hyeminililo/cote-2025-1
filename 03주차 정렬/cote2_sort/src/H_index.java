import java.util.Arrays;

public class H_index {
    public static int solution(int[] citations) {
        Arrays.sort(citations); // {0,1,3,5,6}

        int length = citations.length;
        int answer = 0;

        // i = h
        for (int i = 0; i <= length; i++) {
            // 인용된 횟수가 i보다 많을때마다 체크할 수 있는 변수 선언
            int count = 0;

            for (int c : citations) {
                if (c >= i) count++; // 인용횟수가 h보다 많으면 count + 1
            }
            // 현재 count 값보다 i가 크다면 -> // 1번 조건 으로 따지면 2번 조건이 바로 나오게 됨 answer 갱신
            if (count >= i) {
                answer = i;
            }
        }
        return answer;
    }
}
