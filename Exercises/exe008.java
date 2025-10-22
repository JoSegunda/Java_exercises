import java.util.Scanner;

public class exe008 {
    static double balance = 0;

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int choice;
        double depositAmount, withdraw;

        do {
            Thread.sleep(2000);
            printMenu();
            System.out.print("Enter your choice (1 - 4): ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> ShowBalance();
                case 2 -> {
                    System.out.print("Deposit amount: ");
                    depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                }
                case 3 ->{
                    System.out.print("Amount to withdraw: ");
                    withdraw = sc.nextDouble();
                    withdrawAmount(withdraw);
                }
            }
        } while (choice != 4);
        System.out.println("Thank you, have a good day");
        sc.close();
    }
    static  void ShowBalance(){
        printDashes();
        System.out.println("Current balance: "+balance);
        printDashes();
    }

    static void deposit(double amount){

        if (amount < 0){
            System.out.println("Amount can't be negative.");
        }
        else {
            printDashes();
            balance = amount;
            System.out.println("Deposited $"+amount);
        }


    }

    static  void withdrawAmount(double amount){

        if (amount > balance ) {
            System.out.println("Current Balance: " + balance);
            System.out.println("Unable to withdraw");
        }
       else if (balance < 0){
                System.out.println("Unable to withdraw negative funds.");
        }else{
            balance = balance - amount;
            printDashes();
            System.out.println("Withdrawn $"+amount);
        }
    }

    static void printDashes(){
        System.out.println("-----------------------");
    }

    static void printMenu(){
        System.out.println("==========================");
        System.out.println("      Banking program     ");
        System.out.println("==========================");
        System.out.println("|     1. Show balance    |");
        System.out.println("|     2. deposit         |");
        System.out.println("|     3. Withdraw        |");
        System.out.println("|     4. Exit            |");
        System.out.println("==========================");
    }
}
