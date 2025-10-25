import java.util.Scanner;
import java.util.Random;
public class exe012 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] option = {"rock","paper","scissors"};
        int stop = 0;

        System.out.println("==========================");
        System.out.println("Rock, Paper and Scissors Game");
        System.out.println("==========================");

        String move =" ";
        int indexChoice;
        String playAgain;
        do {
            while( !(move.equals("rock"))
                    && !(move.equals("paper"))
                    && !(move.equals("scissors"))){
                System.out.print("Enter Your move: ");
                move = sc.nextLine().toLowerCase();
            }

            indexChoice = random.nextInt(0, 3);
            System.out.println("Computer Choice: " + option[indexChoice]);

            Thread.sleep(2000);

            PrintDashes();
            CheckOutcome(option[indexChoice], move);
            PrintDashes();

            System.out.println("Play again? [Y / N]: ");
            playAgain = sc.nextLine().toLowerCase();
            move = "";
            if (playAgain.equals("n")) {
                stop = 1;
            }

        } while (stop != 1);
        System.out.println("Game over!");

        sc.close();
    }

    static void PrintDashes(){
        System.out.println("==========");
    }
    static void CheckOutcome(String pc, String user){
        if (pc.equals(user)){
            System.out.println("It's a Tie");
        } else if ((pc.equals("rock") && user.equals("scissors"))
                || (pc.equals("scissors") && user.equals("paper"))
                || (pc.equals("paper") && user.equals("rock"))) {
            System.out.println("You lost!");
        } else {
            System.out.println("You won!");
        }
    }
}
