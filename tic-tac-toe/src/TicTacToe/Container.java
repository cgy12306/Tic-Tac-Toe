package TicTacToe;

public class Container {
    public static Boards getBoard(int size){
        return new Board(size);
    }
}
