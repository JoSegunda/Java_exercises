import java.util.Scanner;

public class e004 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        var  n1 = scan.nextInt();

        System.out.println("Digite outro valor: ");
        var n2 = scan.nextInt();

        System.out.println(n1 + " + "+n2+" = "+(n1+n2));
        System.out.println(n1 + " - "+n2+" = "+(n1-n2));
        System.out.println(n1 + " * "+n2+" = "+(n1*n2));
        System.out.println(n1 + " / "+n2+" = "+(n1/n2));
        System.out.println(n1 + " % "+n2+" = "+(n1%n2));
        


    }
}
