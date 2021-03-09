package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCompression {
    public static int solution(String str) {
        int answer = str.length();

        for (int i = 1; i <= str.length() / 2; i++) {
            int result = check(str, i);
            if (result < answer) answer = result;
        }
        return answer;
    }

    public static int check(String str, int size) {
        StringBuilder result = new StringBuilder();
        List<String> word = new ArrayList<>();

        int exist = str.length() % size;

        for (int i = 0; i <= str.length() - size; i += size) {
            word.add(str.substring(i, i + size));
        }

        int cnt = 1;

        for (int i = 0; i < word.size() - 1; i++) {
            if (word.get(i).equals(word.get(i + 1))) {
                cnt++;
            } else {
                if (cnt > 1) {
                    result.append(result);
                    result.append(cnt);
                    result.append(word.get(i));
                } else {
                    result.append(result);
                    result.append(word.get(i));
                    cnt = 1;
                }
            }
        }

        if (cnt > 1) {
            result.append(result);
            result.append(cnt);
            result.append(word.get(word.size() - 1));
        } else {
            result.append(result);
            result.append(word.get(word.size() - 1));
        }

        return result.length() + exist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(solution(inputString));
    }
}
