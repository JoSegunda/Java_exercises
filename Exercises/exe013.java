import java.util.Scanner;
import java.util.Random;

public class exe013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] symbols = {"🍒","🍉","🍋","🔔","🌟"};
        int balance = 100;
        int bet = 0;
        String stop = "";

        System.out.println("===========================");
        System.out.println("  Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 🌟");
        System.out.println("===========================");

        do {
            System.out.println("Place your bet amount: ");
            bet = sc.nextInt();

            System.out.println("=========");

            System.out.println("=========");

            while (!(stop.equals("y")) && !(stop.equals("n"))) {
                System.out.print("Do you want to play again? [Y / N]");
                stop = sc.nextLine().toLowerCase();
            }

        } while (!stop.equals("n"));

        sc.close();
    }
}
