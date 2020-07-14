package programers;

import java.util.HashMap;
import java.util.Map;

public class unCompletedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int count = 0;
        Map<String, Integer> hashMap = new HashMap<>();

        for (String name : participant) { // 참가자 체크, 해시맵 삽입
            if (hashMap.get(name) == null) {
                hashMap.put(name,1);
            } else {
                count = hashMap.get(name) + 1;
                hashMap.put(name, count);
            }
        }

        for (String complement : completion) { // 항상 1 작기 때문에 -1 후 get, 완주자 삽입
            count = hashMap.get(complement) - 1;
            hashMap.put(complement, count);
        }

        for (String name : hashMap.keySet()) { // 여기서 가져온 이름은 미 완주자
            if (hashMap.get(name) == 1) {
                answer = name;
            }
        }
        return answer;
    }
}
