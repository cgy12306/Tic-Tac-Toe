package TicTacToe;

public class Player implements Players {
    private char name;
    private char token;
    private int row;
    private int col;
    Player(char name, char token){
        this.name = name;
        this.token = token;
    }

    @Override
    public void setRC(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public char getName(){
        return this.name;
    }

    @Override
    public void play(Boards board) {
        board.getBoard()[row][col] = this.token;
    }

}
