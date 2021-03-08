package programers;

import java.util.Arrays;

public class TheBiggestNumber {

    public static String solution(int[] numbers) {

        StringBuilder answer = new StringBuilder();

        String[] strNumbers = new String[numbers.length];

        // 단순 메소드 호출, lambda 변환
        Arrays.setAll(strNumbers, i -> String.valueOf(numbers[i]));

        // 단순 오버라이딩, lambda 변환
        Arrays.sort(strNumbers, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        if (!strNumbers[0].startsWith("0")) {
            for (String str_number : strNumbers) {
                answer.append(str_number);
            }
        } else {
            answer.append("0");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
}
