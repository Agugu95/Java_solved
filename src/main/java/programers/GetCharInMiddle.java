package programers;

public class GetCharInMiddle {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 1) { // 홀수
            answer = String.valueOf(s.charAt(s.length() / 2));
        } else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        GetCharInMiddle g = new GetCharInMiddle();
        String a = g.solution("abcdef");
        System.out.println(a);
    }
}
