import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int citationsArray[] = {3, 0, 6, 1, 5};
        solution(citationsArray);
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);
        System.out.println("citations : "+Arrays.toString(citations));

        int answer = 0;
        return answer;
    }
}