package TicTacToe;

public interface Check {
    public abstract boolean rowWin();
    public abstract boolean colWin();
    public abstract boolean diagWin();
}
