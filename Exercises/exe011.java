import java.util.Scanner;

public class exe011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] questions ={
                "What does a variable store", "Which symbol is used for comments in Python",
                "What is the result of 3 + 2 * 2 in most programming languages","Which data type is used to store true or false values",
                "What is the purpose of an if statement","Which of these is a loop structure","What is an algorithm"};
        String[][] options= {
                {"Only numbers","Only text","Data values that can change", "Information that can vary during program execution"},
                {"//","#","<!-->","/* */"}, {"10","7","8","9"},{"int","String","boolean","float"},{"To repeat a block of code","To make decisions based on conditions","To import libraries","To define a variable"},
                {"if","for","print","break"},{"A set of steps to solve a problem","A programming language","A data structure","A type of variable"}
        };
        String[] answers = {"Information that can vary during program execution","#",
                "7","boolean","To make decisions based on conditions","for"};
        int guess = 0;
        System.out.println("============================");
        System.out.println("Quiz Game");
        System.out.println("============================");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]+"?");
            for (int n = 0; n < 4; n++){
                System.out.println(n+1 +". "+options[i][n]);
            }
            System.out.print("Your Guess: ");
            guess = sc.nextInt();
            IsCorrect(i, guess);
        }

        sc.close();
    }

    static  boolean IsCorrect(int row, int column){
        if
    }
}
