package TicTacToe;

public class RowCheck implements Checks{
    public RowCheck(Boards board) {
    }

    @Override
    public boolean Win(Boards board) {
        boolean flag = true;
        for(int row = 0; row < board.getSize(); row++){
            flag = true;
            char start = board.getBoard()[row][0];
            for(int col = 0; col<board.getSize();col++){
                if(start != board.getBoard()[row][col] || board.getBoard()[row][col] == 0){
                    flag = false;
                }
            }
            if(flag) return flag;
        }
        return flag;
    }

}
