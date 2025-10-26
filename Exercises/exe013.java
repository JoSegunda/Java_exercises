import java.util.Scanner;
import java.util.Random;

public class exe013 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] symbols = {"🍒","🍉","🍋","🔔","🌟"};
        int balance = 100;
        String[] outcome = new String[3];
        int bet = 0;
        String stop = "";

        System.out.println("===========================");
        System.out.println("  Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 🌟");
        System.out.println("===========================");

        do {
            System.out.print("Place your bet amount: ");
            bet = sc.nextInt();
            // Check if bet > current balance
            if (bet > balance){
                System.out.println("Bet amount to high");
                System.out.println("Current Balance: "+balance);
                while (bet > balance){
                    System.out.print("Place your bet amount: ");
                    bet = sc.nextInt();
                }
            }

            sc.nextLine();

            System.out.println("Spinning...");
            Thread.sleep(2000);

            System.out.println("=========");
                for(int i = 0; i < 3; i++){
                    int n = random.nextInt(0,5);
                    outcome[i] = symbols[n];
                }
            System.out.print(outcome[0]+" | ");
            Thread.sleep(1000);
            System.out.print(outcome[1]+" | ");
            Thread.sleep(1000);
            System.out.print(outcome[2]);
            System.out.println("\n=========");

            if (outcome[0].equals(outcome[1]) && outcome[1].equals(outcome[2])){
                System.out.println("You won");
            }
            else {
                System.out.println("You Lost!");
                balance -= bet;
            }

            while (!(stop.equals("y")) && !(stop.equals("n"))) {
                System.out.print("Do you want to play again? [Y / N]");
                stop = sc.nextLine().toLowerCase();
            }

        } while (!stop.equals("n") || balance <= 0);

        System.out.println("Exiting....");

        sc.close();
    }
}
