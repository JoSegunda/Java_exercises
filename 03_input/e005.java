import java.util.Scanner;

public class e005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        var firstValue = input.nextInt();

        System.out.print("Digite outro valor: ");
        var secondValue = input.nextInt();

        System.out.printf("%d + %d = %d\n",firstValue,secondValue,(firstValue+secondValue));
        System.out.printf("%d * %d = %d\n",firstValue,secondValue,(firstValue*secondValue));
        if(firstValue > secondValue || firstValue == secondValue){
            System.out.printf("%d - %d = %d\n",firstValue,secondValue,(firstValue-secondValue));
        }
        else if(secondValue > firstValue){
            System.out.printf("%d - %d = %d\n",secondValue,firstValue,(secondValue-firstValue));

        }

        System.out.printf("%d / %d = %d\n",firstValue,secondValue,(firstValue/secondValue));

        if(firstValue%secondValue==0){
            System.out.printf("%d % %d = %d\n",firstValue,secondValue,(firstValue%secondValue));

        }else{
            System.out.println("O resto da divisão não é zero.");
        }

        input.close();
    }    
}
