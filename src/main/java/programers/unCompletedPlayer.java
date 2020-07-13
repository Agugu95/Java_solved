package programers;

public class unCompletedPlayer {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        for (String s : participant) {
            boolean completed = true;
            for (int j = 0; j < completion.length; j++) {
                if (s.equals(completion[j])) {
                    completion[j] = null;
                    completed = false;
                    break;
                }
            }
            if (completed) {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}
