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

        System.out.println("Current Balance: $"+balance);
        do {
            stop = " ";
            System.out.print("Place your bet amount: ");
            bet = sc.nextInt();

            // Check if bet > current balance
            if (bet > balance || bet == 0){
                System.out.println("Invalid Bet");
                System.out.println("Current Balance: $"+balance);
                while (bet > balance || bet == 0){
                    System.out.print("Place your bet amount: ");
                    bet = sc.nextInt();
                }
            }

            sc.nextLine();

            System.out.println("Spinning...");
            Thread.sleep(2000);

            System.out.println("============");
                for(int i = 0; i < 3; i++){
                    int n = random.nextInt(0,5);
                    outcome[i] = symbols[n];
                }
            System.out.print(outcome[0]+" | ");
            Thread.sleep(1000);
            System.out.print(outcome[1]+" | ");
            Thread.sleep(1000);
            System.out.print(outcome[2]);
            System.out.println("\n============");

            int won = UpdateBalance(outcome, bet);
            balance += won;
            System.out.print(" $"+won);
            System.out.println("\nCurrent Balance: "+balance);

            while (!(stop.equals("y")) && !(stop.equals("n"))) {
                System.out.print("Do you want to play again? [Y / N]: ");
                stop = sc.nextLine().toLowerCase();
            }

        } while (!stop.equals("n") || balance <= 0);

        System.out.println("You won: "+balance);
        System.out.println("Exiting....");

        sc.close();
    }
    static int UpdateBalance(String[] slot, int bet){

        if (slot[0].equals(slot[1]) && slot[1].equals(slot[2])){
            System.out.print("You Won");
            return switch (slot[0]){
                case "🍒" ->  bet * 3;
                case "🍉" ->  bet * 4;
                case "🍋" ->  bet * 5;
                case "🔔" ->  bet * 10;
                case "🌟" ->  bet * 20;
                default  ->  0;
            };
        }
        else if(slot[0].equals(slot[1]) || slot[1].equals(slot[2])){
            System.out.print("Almost! you won ");
            return switch (slot[1]){
                case "🍒" ->  bet * 2;
                case "🍉" ->  bet * 3;
                case "🍋" ->  bet * 4;
                case "🔔" ->  bet * 5;
                case "🌟" ->  bet * 10;
                default  ->  0;
            };
        }
        else {
            System.out.print("You Lost ");
            return -bet;
        }


    }
}
