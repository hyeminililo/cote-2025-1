import java.util.Arrays;

public class Largest_Number {
    public static String solution(int[] numbers) {
        String answer = "";
        // String 배열로 바꿔주기
        String[] numbersString = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersString[i] = String.valueOf(numbers[i]);
        }
//        System.out.println(Arrays.toString(numbersString));
        Arrays.sort(numbersString, (a, b) -> (b + a).compareTo(a + b));
//        System.out.println(Arrays.toString(numbersString));

        StringBuilder sb = new StringBuilder();
        for (String s : numbersString) {
            sb.append(s);
        }
        answer = sb.toString();
        if (answer.startsWith("0")) {
            answer = "0";
        }
        return answer;
    }
}
