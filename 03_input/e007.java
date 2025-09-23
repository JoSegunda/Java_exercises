import java.util.Scanner;

public class e007 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio(cm): ");
        var raio = input.nextFloat();

        var area = Math.PI * (Math.pow(raio, 2));
        var per = 2 * Math.PI * raio;

        System.out.printf("Área do círculo %.2f\nPerímetro: %.2f\n",area,per);

        input.close();
    }
}
