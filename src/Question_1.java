import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int number = keyboard.nextInt();
        String output = "";
        if (number > 0){
            output = "The number is positive";
        }else if (number < 0){
            output = "The number is negative";
        }else {
            System.out.print("The number is zero (and it is even)");
            return;
        }

        if ( number % 2 == 0){
            output = output + " and even";
        }else {
            output = output + " and Odd";
        }

        System.out.print(output);
    }
}
