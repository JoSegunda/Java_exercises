import java.util.Random;
import java.util.Scanner;

public class exe007 {
    public static void main(String[] args){

        Random gen = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Guessing number game [5 tries]");
        System.out.println("-------------------------------");

        int n = gen.nextInt(1,11);
        int attempts = 5;
        while (true){
            System.out.print("Enter a Guess [1 - 10]: ");
            int guess = sc.nextInt();

            if (guess == n){
                System.out.println("You got it right!\nI was thinking of " + n);
                break;
            }
            if (attempts == 0){
                System.out.println("You lost!\nI was thinking of "+ n);
                break;
            }
            System.out.println((guess > n) ? "Too High":"Too Low");
            attempts--;
            System.out.println(attempts + " attempts left.");

        }

    }
}
