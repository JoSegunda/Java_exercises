import java.util.Scanner;

public class exe006 {
    public static void main(String[] args){
        // Variables
        double n1, n2, result;
        char operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator Program");
        System.out.println("------------------");

        System.out.print("Enter first value: ");
        n1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter operation (+, -, *, /)");
        operator = sc.next().charAt(0);

        System.out.print("Enter second value: ");
        n2 = sc.nextDouble();

        switch (operator){
            case '+' -> System.out.println(n1+" + "+n2+" = "+(n1+n2));
            case '*' -> System.out.println(n1+" x "+n2+" = "+(n1+n2));
            case '-' -> System.out.println(n1+" - "+n2+" = "+(n1-n2));
            case '/' -> {
                if (n2 == 0){
                    System.out.println("Cannot divide by zero");
                }
                else {
                    System.out.println(n1+" / "+n2+" = "+(n1/n2));
                }
            }
            default -> System.out.println("Invalid input.....");
        }
        sc.close();
    }
}
