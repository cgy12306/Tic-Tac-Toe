package TicTacToe;

public interface Players {
    char getName();
    void play(Boards board);
    void setRC(int row, int col);
}
