import java.util.TreeMap;

class PhoneNumber {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        // 정수형으로 받기 위한 phone_book과 크기가 같은 배열 선언
            // => 접두어가 작은 것부터 비교하기 위해, 정렬할 수 있도록 정수형 배열을 선언했다.
        int[] phone_book_int = new int[phone_book.length];

        // 정렬하기 위해 TreeMap으로 생성
        TreeMap<Integer, String> bookMap = new TreeMap<>();

        for (int i = 0; i < phone_book_int.length; i++) {
            phone_book_int[i] = Integer.parseInt(phone_book[i]);
        }

        for (int i = 0; i < phone_book_int.length; i++) {
            bookMap.put(phone_book_int[i], phone_book[i]);
        }

        while (!bookMap.isEmpty()) {
            String start = bookMap.firstEntry().getValue();
            bookMap.remove(bookMap.firstKey());

            for (String a : bookMap.values()) {
                if (a.startsWith(start)) {
                    answer = false;
                    return answer;
                }
            }


        }

        return answer;
    }
}
