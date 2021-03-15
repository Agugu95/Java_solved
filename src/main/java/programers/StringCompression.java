package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCompression {
    public static int solution(String str) {
        int min = str.length();

        for (int i = 1; i <= str.length() / 2; i++) {
            int comp = compression(str, i).length();
            min = Math.min(min, comp);
        }
        return min;
    }

    public static String compression(String str, int i) {
        int count = 1;
        StringBuilder comp = new StringBuilder();
        String sliced = "";

        for (int j = 0; j <= str.length() + i; j += i) {
            String now;

            if (j >= str.length()) {
                now = "";
            } else if (str.length() < j + i) {
                now = str.substring(j);
            } else {
                now = str.substring(j, j + i);
            }

            if (j != 0) {
                if (now.equals(sliced)) {
                    count++;
                } else if (count >= 2) {
                    comp.append(comp).append(sliced);
                    count = 1;
                } else {
                    comp.append(sliced);
                }
            }
            sliced = now;
        }
        return comp.toString();
    }


    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
        System.out.println(solution("ababcdcdababcdcd"));
    }
}
