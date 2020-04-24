/*999. Available Captures for Rook

On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.

The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops.

Return the number of pawns the rook can capture in one move.



Example 1:



Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation:
In this example the rook is able to capture all the pawns.
Example 2:



Input: [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 0
Explanation:
Bishops are blocking the rook to capture any pawn.
Example 3:



Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation:
The rook can capture the pawns at positions b5, d6 and f5.


Note:

board.length == board[i].length == 8
board[i][j] is either 'R', '.', 'B', or 'p'
There is exactly one cell with board[i][j] == 'R'
* */

package com.problems.problem999;


import java.util.HashMap;
import java.util.Map;

public class Problem999 {
    public static void main(String[] args) {
        Problem999 instance = new Problem999();

        char[][] input = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}};

        int result = instance.numRookCaptures(input);

        System.out.println(result);
    }

    public int numRookCaptures(char[][] board) {
        Map<Integer, Integer> rowAndCol = GetRookRowAndCol(board);
        Map.Entry<Integer, Integer> entry = rowAndCol.entrySet().iterator().next();

        return checkWest(board, entry.getKey(), entry.getValue()) +
                checkEast(board, entry.getKey(), entry.getValue()) +
                checkNorth(board, entry.getKey(), entry.getValue()) +
                checkSouth(board, entry.getKey(), entry.getValue());
    }

    public Map<Integer, Integer> GetRookRowAndCol(char [][] board){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i][j] == 'R'){
                    map.put(i, j);
                    return map;
                }
            }
        }
        return map;
    }

    private int checkWest(char[][] board, Integer row, Integer col) {
        for (int i = row + 1; i < 8; i++) {
            if(board[i][col] == 'B'){
                return 0;
            }
            else if(board[i][col] == 'p'){
                return 1;
            }
        }
        return 0;
    }

    private int checkEast(char[][] board, Integer row, Integer col) {
        for (int i = row - 1; i > 0; i--) {
            if(board[i][col] == 'B'){
                return 0;
            }
            else if(board[i][col] == 'p'){
                return 1;
            }
        }
        return 0;
    }

    private int checkNorth(char[][] board, Integer row, Integer col) {
        for (int i = col + 1; i < 8; i++) {
            if(board[row][i] == 'B'){
                return 0;
            }
            else if(board[row][i] == 'p'){
                return 1;
            }
        }
        return 0;
    }

    private int checkSouth(char[][] board, Integer row, Integer col) {
        for (int i = col - 1; i > 0; i--) {
            if(board[row][i] == 'B'){
                return 0;
            }
            else if(board[row][i] == 'p'){
                return 1;
            }
        }
        return 0;
    }

}
