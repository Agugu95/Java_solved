import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class socar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int car = Integer.parseInt(br.readLine());
        String[] startTime = new String[car];
        String[] endTime = new String[car];
        String str;
        Integer[] startArr = new Integer[car];
        Integer[] endArr = new Integer[car];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < car; i++){
            str = br.readLine();
            str = str.replace(":", "");
            startTime[i] = str.substring(str.indexOf(""), str.indexOf(" ~"));
            endTime[i] = str.substring(str.indexOf(" ")). replace(" ~ ", " ").replace(" ", "");
            startArr[i] = Integer.parseInt(startTime[i]);
            endArr[i] = Integer.parseInt(endTime[i]);
        }
        Arrays.sort(startArr, Collections.reverseOrder());
        Arrays.sort(endArr);

        if (startArr[0] > endArr[0]) {
            System.out.println("차가 같이 있는 시간이 없음");
        } else {
            stringBuilder.append(startArr[0]);
            stringBuilder.insert((stringBuilder.length() - 2), ":");
            stringBuilder.append(endArr[0]);
            stringBuilder.insert((stringBuilder.length() - 2), ":");
            stringBuilder.insert((stringBuilder.length() / 2), " ~ ");
            System.out.println(stringBuilder.toString());
        }
    }
}
