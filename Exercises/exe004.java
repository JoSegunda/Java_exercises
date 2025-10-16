import java.util.Scanner;

public class exe004 {
    public static void main(String[] args){
        double weightLbs, weightKg;
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight conversion Program");
        System.out.println("----------------------------");
        System.out.println("Press [1] for lbs to kg\npress [2] for kg to lbs");
        System.out.println("----------------------------");

        System.out.print("Enter the option desired: ");
        option = sc.nextInt();

        if (option == 1){
            System.out.print("Weight to convert: ");
            weightLbs = sc.nextDouble();
            weightKg  = 0.45359237 * weightLbs;
            System.out.printf("%.2f lbs to kilogram is %.2f kg",weightLbs,weightKg);
        } else if (option == 2) {
            System.out.print("Weight to convert: ");
            weightKg = sc.nextDouble();
            weightLbs  = weightKg / 0.45359237;
            System.out.printf("%.2f kg to pounds is %.2f lbs",weightKg,weightLbs);
        }else {
            System.out.println("Invalid option...");
        }

        sc.close();
    }
}
