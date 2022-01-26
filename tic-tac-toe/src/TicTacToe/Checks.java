package TicTacToe;

public class Checks{
    Players player;

    public boolean totalCheck(Players player){
        this.player = player;
        CheckWin check = new CheckWin();

        if(check.rowWin() || check.colWin() || check.diagWin()){
            System.out.println(player.getName() + "님이 승리하셨습니다.");
            return true;
        }
        return false;
    }
}
