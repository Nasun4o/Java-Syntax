import java.util.Scanner;

/**
 * Created by PC-PC on 3/19/2016.
 */
public class Problem1 {

    public static void main(String[] args) {

        /* DRUGITE ZADACHI S V PAPKATA :) */
        Scanner console = new Scanner(System.in);

        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();

        int result = firstNumber * secondNumber;

        System.out.printf("Result: %d", result);
    }
}