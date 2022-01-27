package TicTacToe;

import java.util.List;

public interface Boards {
    int getCnt();
    String toString();
    int getSize();
    char[][] getBoard();
    boolean totalCheck(Players player, Boards board, List<Checks> checks);
}
