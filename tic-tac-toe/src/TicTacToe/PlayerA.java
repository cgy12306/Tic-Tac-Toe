package TicTacToe;

import java.util.Scanner;

import static TicTacToe.Board.board;


public class PlayerA implements Players {
    public static char token = 'O';

    @Override
    public String getName(){
        return "A";
    }

    @Override
    public void play() {
        System.out.println(getName() + "님의 차례입니다.");
        input(this.token);
    }

    static void input(char token) {
        int row, col;
        System.out.println("행과 열을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        do {
            row = sc.nextInt();
            col = sc.nextInt();
        }while(check(row, col));

        board[row][col] = token;
    }
    static boolean check(int row, int col){

        if((row < 0  || row >= board.length) || (col < 0 || col >= board.length)){
            System.out.println("잘못된 입력입니다.");
            return true;
        }
        if(board[row][col] == 'X' || board[row][col] == 'O' ){
            System.out.println("이미 입력된 곳입니다.");
            return true;
        }
        else return false;
    }

}
