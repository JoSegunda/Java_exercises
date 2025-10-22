import java.util.Scanner;

public class exe008 {
    static double balance = 0;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("==========================");
        System.out.println("      Banking program     ");
        System.out.println("==========================");
        System.out.println("|     1. Show balance    |");
        System.out.println("|     2. deposit         |");
        System.out.println("|     3. Withdraw        |");
        System.out.println("|     4. Exit            |");
        System.out.println("==========================");

        while (true){
            System.out.println("Enter your choice (1 - 4): ");
            choice = sc.nextInt();

            if (choice == 4) {
                break;
            }
        }


        sc.close();
    }
}
