import java.util.Scanner;

public class Intervalle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double x = keyboard.nextDouble();

        boolean I = (( x >= 2 && x <3 ) || ( x > 0 && x <= 1  ) || ( x >=-10 && x <= -2) );

        if (I){
            System.out.print("x belongs to I");
        }else {
            System.out.print("x does not belong to I");
        }
    }
}
