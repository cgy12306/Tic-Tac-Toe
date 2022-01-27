package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board implements Boards{
    private static char[][] board;
    private static int size;
    private static int cnt;

    public Board(int size){
        this.size = size;
        board = new char[size][size];
        cnt = size * size;
    }

    @Override
    public char[][] getBoard() {
        return board;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCnt() {
        return cnt;
    }

    @Override
    public String toString() {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 0){
                    System.out.print("-");
                }
                else System.out.print(board[i][j]);
            }
            System.out.println();
        }
        this.cnt--;
        return "";
    }
    public boolean totalCheck(Players player, Boards board, List<Checks> checks){

        for(Checks c:checks){
            if(c.Win(board)) return true;
        }

        return false;
    }
}
