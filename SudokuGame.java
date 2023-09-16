package sharma;

import java.util.Scanner;



public class SudokuGame {

    private int[][] board;
    private static final int SIZE = 9;

    public SudokuGame(String boardString) {
        board = new int[SIZE][SIZE];
        initializeBoard(boardString);
    }

    private void initializeBoard(String boardString) {
        if (boardString.length() != SIZE * SIZE) {
            throw new IllegalArgumentException("Invalid board string length");
        }

        int index = 0;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                char charValue = boardString.charAt(index++);
                if (charValue == '.') {
                    board[row][col] = 0;
                } else {
                    board[row][col] = Character.getNumericValue(charValue);
                }
            }
        }
    }

    private boolean isValidMove(int row, int col, int num) {
        // Check row and column
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValidMove(row, col, num)) {
                            board[row][col] = num;
                            if (solve()) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void play() {
        System.out.println("Sudoku puzzle to solve:");
        printBoard();
        if (solve()) {
            System.out.println("\nSolved Sudoku:");
            printBoard();
        } else {
            System.out.println("\nNo solution exists.");
        }
    }

    private void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sudoku board as a string (use '.' for empty cells): ");
        String boardString = scanner.nextLine();
        scanner.close();

        SudokuGame sudoku = new SudokuGame(boardString);
        sudoku.play();
    }
}
