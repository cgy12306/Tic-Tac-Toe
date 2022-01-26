package TicTacToe;


public class PlayerB implements Players {

    private char token = 'X';

    @Override
    public String getName(){
        return "B";
    }

    @Override
    public void play() {
        System.out.println(getName() + "님의 차례입니다.");
        PlayerA.input(this.token);
    }

}
