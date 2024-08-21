// src/main/java/com/iqquestor/sudoku/service/Validator.java

package com.iqquestor.sudoku.service;

import org.springframework.stereotype.Service;

@Service
public class Validator {
    public String isValidSudoku(int[][] board) {
        boolean isBoardValid = true;
        boolean isBoardComplete = true;
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.println(board[i][j]);
//            }
//        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    isBoardComplete = false;
                } else if (!isValidPlacement(board, i, j)) {
                    isBoardValid = false;
                }
            }
        }

        if (isBoardComplete && isBoardValid) {
            return "Congratulations! You've solved the Sudoku!";
        } else if (isBoardValid) {
            return "So far so good! Keep going!";
        } else {
            return "There's a mistake in your current solution. Please check your entries.";
        }


//        // Validate rows
//        for (int i = 0; i < 9; i++) {
//            if (!isValidBlock(board[i])) {
//                return false;
//            }
//        }
//
//        // Validate columns
//        for (int i = 0; i < 9; i++) {
//            int[] column = new int[9];
//            for (int j = 0; j < 9; j++) {
//                column[j] = board[j][i];
//            }
//            if (!isValidBlock(column)) {
//                return false;
//            }
//        }
//
//        // Validate 3x3 subgrids
//        for (int row = 0; row < 9; row += 3) {
//            for (int col = 0; col < 9; col += 3) {
//                if (!isValidSubgrid(board, row, col)) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
    }

    private boolean isValidPlacement(int[][] board, int row, int col) {
        int num = board[row][col];

        // Check the row
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 grid
        int gridRowStart = (row / 3) * 3;
        int gridColStart = (col / 3) * 3;

        for (int i = gridRowStart; i < gridRowStart + 3; i++) {
            for (int j = gridColStart; j < gridColStart + 3; j++) {
                if (i != row && j != col && board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

//    private boolean isValidBlock(int[] block) {
//        boolean[] seen = new boolean[9];
//        for (int num : block) {
//            if (num != 0) { // Skip empty cells (represented by 0)
//                if (seen[num - 1]) {
//                    return false;
//                }
//                seen[num - 1] = true;
//            }
//        }
//        return true;
//    }
//
//    private boolean isValidSubgrid(int[][] board, int startRow, int startCol) {
//        boolean[] seen = new boolean[9];
//        for (int row = startRow; row < startRow + 3; row++) {
//            for (int col = startCol; col < startCol + 3; col++) {
//                int num = board[row][col];
//                if (num != 0) {
//                    if (seen[num - 1]) {
//                        return false;
//                    }
//                    seen[num - 1] = true;
//                }
//            }
//        }
//        return true;
//    }
}
