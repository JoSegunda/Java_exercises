import java.util.ArrayList;
import java.util.Scanner;


public class exe014 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of fruits you want to save: ");
        n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.print("Enter a fruit: ");
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println(fruits);
        sc.close();
    }
}
