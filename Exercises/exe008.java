import java.util.Scanner;

public class exe008 {
    static double balance = 0;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("==========================");
        System.out.println("      Banking program     ");
        System.out.println("==========================");
        System.out.println("|     1. Show balance    |");
        System.out.println("|     2. deposit         |");
        System.out.println("|     3. Withdraw        |");
        System.out.println("|     4. Exit            |");
        System.out.println("==========================");

        int choice;
        double depositAmount, withDrawal;
        do {
            System.out.println("Enter your choice (1 - 4): ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> ShowBalance();
                case 2 -> {
                    System.out.println("Deposit amount: ");
                    depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                }
                case 3 ->{
                    System.out.println("Amount to withdraw: ");
                    withDrawal = sc.nextDouble();
                }
            }
        } while (choice != 4);

        sc.close();
    }
    static  void ShowBalance(){
        printDashes();
        System.out.println("Current balance: "+balance);
        printDashes();
    }

    static void deposit(double amount){
        printDashes();
        System.out.println("Deposited $"+amount);
        printDashes();
    }

    static  void withdrawalAmount(double amount){
        balance -= amount;
        printDashes();
        System.out.println("Withdrawn $"+amount);
        printDashes();
    }

    static void printDashes(){
        System.out.println("-----------------------");
    }
}
