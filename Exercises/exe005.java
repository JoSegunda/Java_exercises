import java.util.Scanner;

public class exe005 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double area, radius, circumference, volume;

        System.out.print("input the radius: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * (Math.pow(radius,2));
        volume = (4.0 / 3.0) * (Math.PI * Math.pow(radius,3));

        System.out.printf("The volume is: %.2fcm³\n",volume);
        System.out.printf("The area of the circle is: %.2fm²\n",area);
        System.out.printf("The circumference of the circle is: %.2fcm\n",circumference);

    }
}
