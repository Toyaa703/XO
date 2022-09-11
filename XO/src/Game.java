import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board_ = new Board();
        board_.Show_Board();
        char turn_;
        int cnt_ = 0;
        Scanner scanner = new Scanner(System.in);
        int pos1_= 0, pos2_ = 0;
        while (true) {
            if(!board_.Check_Board()) {
                System.out.println("No one win the Game!");
                break;
            }
            cnt_++;
            if(cnt_ % 2 == 1) turn_ = 'X';
            else turn_ = 'O';
            System.out.println(turn_ + " " + "turn");
            while (true) {
                pos1_ = scanner.nextInt();
                pos2_ = scanner.nextInt();
                if(board_.Update(pos1_, pos2_, turn_) != true) {
                    System.out.println("Unavailable position!");
                    continue;
                }
                else {
                    board_.Show_Board();
                    break;
                }
            }
            if(board_.Game_Over() != false) {
                System.out.println(turn_ + " is the winner!");
                break;
            }
        }
    }
}
