package programers;

import java.util.Arrays;
import java.util.HashMap;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] temp = {0, 0, 0};
        int[] num1 = new int[]{1, 2, 3, 4, 5};
        int[] num2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i]) {
                temp[0]++;
            }
            if (answers[i] == num2[i]) {
                temp[1]++;
            }
            if (answers[i] == num3[i]) {
                temp[2]++;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(temp[0], 1);
        map.put(temp[1], 2);
        map.put(temp[2], 3);
        Arrays.sort(temp);
        if (temp[0] <= temp[1] && temp[1] <= temp[2]) {
            answer = new int[]{map.get(temp[0]), map.get(temp[1]), map.get(temp[2])};
        } else if (temp[0] <= temp[1]) {
            answer = new int[]{map.get(temp[1]), map.get(temp[2])};
        } else {
            answer = new int[]{map.get(temp[1])};
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
