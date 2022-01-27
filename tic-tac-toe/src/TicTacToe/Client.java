package TicTacToe;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Players A = new Player('A', 'O');
        Players B = new Player('B', 'X');

        Boards board = Container.getBoard(3);

        List<Checks> checks = new ArrayList<>();
        Checks rowCheck = new RowCheck(board);
        Checks colCheck = new ColCheck(board);
        Checks diagCheck = new diagCheck(board);
        checks.add(rowCheck);
        checks.add(colCheck);
        checks.add(diagCheck);

        Checks check = new Check();

        while(true) {
            System.out.println(A.getName() + "님의 차례입니다.");
            System.out.println("행과 열을 입력해주세요.");
            input(A, board);
            A.play(board);

            System.out.println(board);

            if(board.totalCheck(A, board, checks)) {
                System.out.println(A.getName() + "님이 승리하셨습니다.");
                break;
            }

            if(board.getCnt() <= 0) break;

            System.out.println(B.getName() + "님의 차례입니다.");
            System.out.println("행과 열을 입력해주세요.");
            input(B, board);
            B.play(board);
            System.out.println(board);
            if(board.totalCheck(B, board, checks)) {
                System.out.println(B.getName() + "님이 승리하셨습니다.");
                break;
            }
            if(board.getCnt() <= 0) break;
        }
    }
    public static void input(Players player, Boards board){
        int row, col;

        Scanner sc = new Scanner(System.in);
        do {
            row = sc.nextInt();
            col = sc.nextInt();
        }while(check(row, col, board));
        player.setRC(row, col);
    }

    static boolean check(int row, int col, Boards board){

        if((row < 0  || row >= board.getSize()) || (col < 0 || col >= board.getSize())){
            System.out.println("잘못된 입력입니다.");
            return true;
        }
        if(board.getBoard()[row][col] == 'X' || board.getBoard()[row][col] == 'O' ){
            System.out.println("이미 입력된 곳입니다.");
            return true;
        }
        else return false;
    }

}
