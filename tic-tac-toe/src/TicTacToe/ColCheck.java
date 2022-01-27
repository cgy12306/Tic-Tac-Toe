package TicTacToe;

import TicTacToe.Checks;

public class ColCheck implements Checks {

    public ColCheck(Boards board) {}

    @Override
    public boolean Win(Boards board){
        boolean flag = true;
        for(int col = 0; col < board.getSize(); col++){
            flag = true;
            char start = board.getBoard()[0][col];
            for(int row = 0; row < board.getSize(); row++){
                if(start != board.getBoard()[row][col] || board.getBoard()[row][col] == 0){
                    flag = false;
                }
            }
            if(flag) return flag;
        }
        return flag;
    }

}
