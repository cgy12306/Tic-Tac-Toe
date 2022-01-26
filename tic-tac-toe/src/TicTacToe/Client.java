package TicTacToe;


public class Client {

    public static void main(String[] args) {

        Players A = new PlayerA();
        Players B = new PlayerB();

        Board board = new Board();
        System.out.println(board.cnt);
        Checks check = new Checks();

        while(true){
            A.play();
            board.boardPrint();
            if(check.totalCheck(A)) break;
            if(Board.cnt <= 0) break;

            B.play();
            board.boardPrint();
            if(check.totalCheck(B)) break;
            if(Board.cnt <= 0) break;
        }
    }
}
