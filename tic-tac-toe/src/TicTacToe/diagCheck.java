package TicTacToe;

public class diagCheck implements Checks{
    public diagCheck(Boards board) {}

    @Override
    public boolean Win(Boards board){
        boolean flag = true;
        int bsize = board.getSize();
        char start = board.getBoard()[0][0];
        for(int diag = 0; diag < bsize; diag++){
            if(start != board.getBoard()[diag][diag] || board.getBoard()[diag][diag] == 0){
                flag = false;
            }
        }
        if(flag) return flag;

        start = board.getBoard()[bsize - 1][bsize - 1];

        for(int diag = bsize - 1; diag >= 0; diag--){
            if(start != board.getBoard()[diag][diag] || board.getBoard()[diag][diag] == 0){
                flag = false;
            }
        }


        return flag;
    }

}
