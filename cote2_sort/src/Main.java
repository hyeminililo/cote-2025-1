import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int numbers[] = {3, 30, 34, 5, 9};
            solution(numbers);
    }

    public  static String solution(int[] numbers) {
        // String 배열로 바꿔주기
        String[] numbersString = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            numbersString[i] = String.valueOf(numbers[i]);
        }
//        System.out.println(Arrays.toString(numbersString));
        Arrays.sort(numbersString,(a, b) -> (b + a).compareTo(a + b) );
        System.out.println(Arrays.toString(numbersString));
        String answer = "";
        return answer;
    }
}
