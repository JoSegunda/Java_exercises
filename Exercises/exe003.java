import java.util.Scanner;

public class exe003 {
    public static void main(String[] args){
        double amount, interest, times_compounded, final_amount;
        int years;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        amount = sc.nextDouble();

        System.out.print("Enter the interest rate(%): ");
        interest = sc.nextDouble() /100;

        System.out.print("Enter number of times compounded: ");
        times_compounded = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        final_amount = amount * Math.pow((1 + (interest/times_compounded)), times_compounded*years);
        System.out.printf("The amount after %d is %.2f\n",years,final_amount);
    }
}
