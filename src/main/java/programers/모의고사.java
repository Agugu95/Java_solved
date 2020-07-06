package programers;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] temp = {0, 0, 0};
        int[] num1 = new int[]{1, 2, 3, 4, 5};
        int[] num2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i] % 5) {
                temp[0]++;
            }
            if (answers[i] == num2[i] % 8) {
                temp[1]++;
            }
            if (answers[i] == num3[i] % 10) {
                temp[2]++;
            }
        }

        int winner = temp[0];
        for (int value : temp) {
            if (winner < value) {
                winner = value;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (winner == temp[i]) {
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i) + 1;
        }
        return answer;
    }
}

