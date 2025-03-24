import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int citationsArray[] = {3, 0, 6, 1, 5};
        System.out.println("result : " + solution(citationsArray));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations); // {0,1,3,5,6}
        int length = citations.length;
        int answer = 0;

        for (int i = 0; i <= length; i++) {
            int count = 0;
            // 1번 조건 으로 따지면 2번 조건이 바로 나오게 됨
            for (int c : citations) {
                if (c >= i) count++;
            }

            if (count >= i) {
                answer = i;
            }
        }

        return answer;
    }
}
