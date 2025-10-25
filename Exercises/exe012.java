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

        String move;
        int indexChoice;
        String playAgain;
        while(true) {
            System.out.print("Enter Your move: ");
            move = sc.nextLine().toLowerCase();

            indexChoice = random.nextInt(0,4);
            Thread.sleep(2000);
            if (option[indexChoice].equals(move)){
                System.out.println("==========");
                System.out.println("You Won");
                System.out.println("==========");
            }
            else{
                System.out.println("==========");
                System.out.println("You Lose");
                System.out.println("==========");
            }
            System.out.println("Play again? [Y / N]: ");
            playAgain = sc.nextLine().toLowerCase();

            if (playAgain.equals("n")){
                stop = 1;
            }

            if (stop == 1){
                break;
            }
        }

        sc.close();
    }
}
