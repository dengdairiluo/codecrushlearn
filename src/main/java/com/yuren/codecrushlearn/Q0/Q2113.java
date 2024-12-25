package com.yuren.codecrushlearn.Q0;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-25 23:49
 */
public class Q2113 {
    public char determineChess(List<String> board, int n) {
        // 检查每一行
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkHorizontal(board, n, i, j) || checkVertical(board, n, i, j) || checkDiagonalRight(board, n, i,
                        j) || checkDiagonalLeft(board, n, i, j)) {
                    return board.get(i).charAt(j); // 返回找到的第一个胜利者
                }
            }
        }
        return 'E'; // 如果没有找到胜利者，返回 'E'
    }

    private boolean checkHorizontal(List<String> board, int n, int row, int col) {
        if (col > n - 5)
            return false;
        char c = board.get(row).charAt(col);
        if (c == 'E')
            return false;
        for (int i = 1; i < 5; i++) {
            if (board.get(row).charAt(col + i) != c)
                return false;
        }
        return true;
    }

    private boolean checkVertical(List<String> board, int n, int row, int col) {
        if (row > n - 5)
            return false;
        char c = board.get(row).charAt(col);
        if (c == 'E')
            return false;
        for (int i = 1; i < 5; i++) {
            if (board.get(row + i).charAt(col) != c)
                return false;
        }
        return true;
    }

    private boolean checkDiagonalRight(List<String> board, int n, int row, int col) {
        if (row > n - 5 || col > n - 5)
            return false;
        char c = board.get(row).charAt(col);
        if (c == 'E')
            return false;
        for (int i = 1; i < 5; i++) {
            if (board.get(row + i).charAt(col + i) != c)
                return false;
        }
        return true;
    }

    private boolean checkDiagonalLeft(List<String> board, int n, int row, int col) {
        if (row > n - 5 || col < 4)
            return false;
        char c = board.get(row).charAt(col);
        if (c == 'E')
            return false;
        for (int i = 1; i < 5; i++) {
            if (board.get(row + i).charAt(col - i) != c)
                return false;
        }
        return true;
    }
}
