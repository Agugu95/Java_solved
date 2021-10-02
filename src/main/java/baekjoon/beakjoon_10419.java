package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class beakjoon_10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if (1 <= input && input <= 100) {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < input; i++) {
                queue.add(Integer.parseInt(br.readLine()));
            }

            while (!queue.isEmpty()) {
                int time = queue.poll();
                int late = 1;

                while (true) {
                    int end = late + (int) Math.pow(late, 2);
                    if (end > time) {
                        System.out.println(late - 1);
                        break;
                    }
                    late++;
                }
            }
        }
    }
}