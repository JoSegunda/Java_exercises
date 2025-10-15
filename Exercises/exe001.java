import java.util.Scanner;
public class exe001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do cateto oposto: ");
        double co = sc.nextDouble();

        System.out.print("Valor do cateto oposto: ");
        double ca = sc.nextDouble();

        double hypo =  Math.hypot(ca,co);
        System.out.println("Valor da hipotenusa: "+hypo);
        sc.close();
    }
}
