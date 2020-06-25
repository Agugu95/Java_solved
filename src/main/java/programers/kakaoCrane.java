package programers;

import java.util.Stack;

public class kakaoCrane {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int movesIdx;
        Stack<Integer> temp = new Stack<>();
        for (int move : moves) {
            movesIdx = move - 1;
            for (int j = 0; j < board.length; j++) { // 열 고정, 행만 내림
                if (board[j][movesIdx] != 0) {
                    if (temp.isEmpty()) {
                        temp.push(board[j][movesIdx]);
                    } else {
                        if (temp.peek() == board[j][movesIdx]) {
                            answer += 2;
                            temp.pop();
                        } else {
                            temp.push(board[j][movesIdx]);
                        }
                    }
                    board[j][movesIdx] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        int answer = solution(arr, moves);
        System.out.println(answer);
    }
}
