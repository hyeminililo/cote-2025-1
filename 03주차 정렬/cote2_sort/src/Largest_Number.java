import java.util.Arrays;

public class Largest_Number {
    public static String solution(int[] numbers) {
        String answer = "";
        // String 배열로 바꿔주기
        String[] numbersString = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersString[i] = String.valueOf(numbers[i]);
        }

        // 비교 후, 정렬
        Arrays.sort(numbersString, (a, b) -> (b + a).compareTo(a + b));

        // 이어붙이기
        StringBuilder sb = new StringBuilder();
        for (String s : numbersString) {
            sb.append(s);
        }
        answer = sb.toString();

        // 예외처리 - 모든 원소 0일 때 0으로 변환
        if (answer.startsWith("0")) {
            answer = "0";
        }
        return answer;
    }
}
