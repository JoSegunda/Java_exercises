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

        System.out.println("The volume is: "+volume);
        System.out.println("The area of the circle is: "+area);
        System.out.println("The circumference of the circle is: "+circumference);

    }
}
