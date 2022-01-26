package TicTacToe;

import static TicTacToe.Board.board;

public class CheckWin implements Check{
    @Override
    public boolean rowWin(){
        boolean flag = true;
        for(int row = 0; row < board.length; row++){
            flag = true;
            char start = board[row][0];
            for(int col = 0; col<board.length;col++){
                if(start != board[row][col] || board[row][col] == 0){
                    flag = false;
                }
            }
            if(flag) return flag;

        }
        return flag;
    }
    @Override
    public boolean colWin(){
        boolean flag = true;
        for(int col = 0; col < board.length; col++){
            flag = true;
            char start = board[0][col];
            for(int row = 0; row < board.length; row++){
                if(start != board[row][col] || board[row][col] == 0){
                    flag = false;
                }
            }
            if(flag) return flag;
        }
        return flag;
    }
    @Override
    public boolean diagWin(){
        boolean flag = true;
        int bsize = board.length;
        char start = board[0][0];
        for(int diag = 0; diag < bsize; diag++){
            if(start != board[diag][diag] || board[diag][diag] == 0){
                flag = false;
            }
        }
        if(flag) return flag;

        start = board[bsize - 1][bsize - 1];

        for(int diag = bsize - 1; diag >= 0; diag--){
            if(start != board[diag][diag] || board[diag][diag] == 0){
                flag = false;
            }
        }


        return flag;
    }

}
