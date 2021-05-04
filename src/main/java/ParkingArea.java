import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ParkingArea {

    final static int[] fourRow = new int[]{1, 0, -1, 0};
    final static int[] fourCol = new int[]{0, 1, 0, -1};
    final static int[] eightRow = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
    final static int[] eightCol = new int[]{-1, -1, -1 , 0, 1, 1, 1, 0};
    static int[][] area;
    static boolean[][] visited;

    static int parking(int size) {
        int count = 0;
        size = size * size;

        if (size > 0) {
            if (size == 1) {
                for (int row = 0; row < area.length; row++) {
                    for (int col = 0; col < area.length; col++) {
                        if (visited[row][col]) {
                            count++;
                        }
                    }
                }
            }

            if (size == 4) {
                for (int row = 0; row < area.length; row++) {
                    for (int col = 0; col < area.length; col++) {
                        int cnt = 0;
                        for (int i = 0; i < size; i++) {
                            row += fourRow[i];
                            col += fourCol[i];
                            if (row >= 0 && row < area.length && col >= 0 && col < area.length && visited[row][col]) {
                                cnt += 1;
                                if (cnt == size) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }

            if (size == 9) {
                for (int row = 0; row < area.length; row++) {
                    for (int col = 0; col < area.length; col++) {
                        int cnt = 0;
                        for (int i = 0; i < size - 1; i++) {
                            int nRow = row + eightRow[i];
                            int nCol = col + eightCol[i];
                            if (nRow >= 0 && nRow < area.length && nCol >= 0 && nCol < area.length && visited[nRow][nCol]) {
                                cnt += 1;
                                if (cnt == size - 1) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        area = new int[size][size];
        visited = new boolean[size][size];
        int[] sizeArr = new int[size];


        for (int x = 0; x < size; x++) {
            String str = br.readLine();
            char[] tmp = str.toCharArray();
            for (int y = 0; y < size; y++) {
                area[x][y] = Integer.parseInt(String.valueOf(tmp[y]));
                if (!visited[x][y] && area[x][y] != 0) {
                    visited[x][y] = true;
                }
            }
        }

        for (int i = 1; i < sizeArr.length; i++) {
            sizeArr[i] = parking(i);
            sizeArr[0] += sizeArr[i];
        }

        System.out.println("물건을 놓는 구역:" + Arrays.deepToString(area));
        System.out.println("total: " + sizeArr[0]);
        for (int i = 1; i < sizeArr.length; i++) {
            System.out.println("sizeArr" + "[" + i + "]" + ": " + sizeArr[i]);
        }
    }
}
