import java.util.HashMap;

class Marathon {
    public String solution(String[] participant, String[] completion) {
        // Key 값은 participant 이름, value는 해당 participant의 수 (동일인 수 방지)
        HashMap<String, Integer> copyParticipant = new HashMap<>();

        String answer = "";
        //  참가자 이름 있는 hashmap 생성 (동일인일 경우 숫자 추가)
        for (int i = 0; i < participant.length; i++) {
            copyParticipant.put(participant[i], copyParticipant.getOrDefault(participant[i], 0) + 1);

        }

        // completion(완주자)에 있는 사람 한 명씩 제거
        for (String completionName : completion) {
            copyParticipant.put(completionName, copyParticipant.get(completionName) - 1);
        }

        // 남은 사람 출력
        for (int i = 0; i < participant.length; i++) {
            if (copyParticipant.get(participant[i]) == 1) {
                answer = participant[i];
                return answer;
            }
        }

        return answer;
    }

}



