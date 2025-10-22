import java.util.Scanner;
import java.util.Random;

public class exe009 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberOfDices;

        System.out.print("Enter the number of dices to roll: ");
        numberOfDices = sc.nextInt();

        int diceRolled;
        for (int i = 0; i < numberOfDices; i++){
            diceRolled = rand.nextInt(1, 7);
            System.out.println("You rolled "+diceRolled);
            RollDice(diceRolled);
        }


        sc.close();
    }
    static void RollDice(int dice){
        String dice1= """
                 _______
                |       |
                |   ⚈   |
                |       |
                 -------
                """;
        String dice2= """
                 _______
                | ⚈     |
                |       |
                |     ⚈ |
                 -------
                """;
        String dice3= """
                 _______
                |⚈      |
                |   ⚈   |
                |      ⚈|
                 -------
                """;
        String dice4= """
                 _______
                |⚈     ⚈|
                |       |
                |⚈     ⚈|
                 -------
                """;
        String dice5= """
                 _______
                |⚈     ⚈|
                |   ⚈   |
                |⚈     ⚈|
                 -------
                """;
        String dice6= """
                 _______
                |⚈     ⚈|
                |⚈     ⚈|
                |⚈     ⚈|
                 -------
                """;
        switch (dice){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}
