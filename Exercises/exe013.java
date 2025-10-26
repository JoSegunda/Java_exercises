import java.util.Scanner;
import java.util.Random;

public class exe013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] symbols = {"🍒","🍉","🍋","🔔","🌟"};
        int balance = 100;
        int bet = 0;

        System.out.println("===========================");
        System.out.println("  Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 🌟");
        System.out.println("===========================");

        while (true){
            System.out.println("Place your bet amount: ");
            bet = sc.nextInt();

            System.out.println("=========");

            System.out.println("=========");
        }

        sc.close();
    }
}
