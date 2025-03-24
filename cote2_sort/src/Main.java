import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int citationsArray[] = {3, 0, 6, 1, 5};
        System.out.println("result : "    +  solution(citationsArray));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations); // {0,1,3,5,6} -> return 3
//      System.out.println("citations : "+Arrays.toString(citations));
        int length = citations.length;
        int answer = 0;
        int currentValue;
        for(int i = 1; i <= length-1; i++) {
            currentValue = citations[i]; //0
            // 1번 조건 && 2번 조건
            if(currentValue <= length-i && currentValue >=i ){
                answer = currentValue;
            }
        }
        return answer;
    }
}