package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class output_11719 {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String word = sc.nextLine();
            if(word.length()>100 || !word.matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣|\" \"]*")) {
                break;
            }
            words.add(word);
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
