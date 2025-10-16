import java.util.Scanner;

public class exe005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temp, result;
        String choice;

        System.out.println("Temperature conversion Program");
        System.out.println("==============================");
        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();
        sc.nextLine();

        System.out.print("Convert to celsius or Fahrenheit? [C / F]: ");
        choice = sc.nextLine().toLowerCase();

        result = (choice.equals("f")) ? (temp * 5/9) + 32: (temp - 32) * 5/9;

        System.out.printf("Temperature: %.2fº%s",result,choice.toUpperCase());
        sc.close();
    }
}
