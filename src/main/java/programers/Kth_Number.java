package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class Kth_Number {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Kth_Number num = new Kth_Number();
        int[] answer = num.solution(arr, commands);
        for (int a : answer) {
            System.out.println(a);
        }
        for (int[] s : commands) {
            System.out.println(Arrays.toString(s));
        }
    }
}
