package TicTacToe;

public class Board implements Boards {
    public static char[][] board;
    private static int size = 3;
    public static int cnt = size * size ;

    Board(){
        board = new char[size][size];
    }

    @Override
    public void boardPrint() {
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
    }

}
