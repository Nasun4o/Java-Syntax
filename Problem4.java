import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by PC-PC on 3/19/2016.
 */
public class Problem4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();


        double formula = Math.pow((a * a + b * b)
                / (a * a - b * b), (a + b + c) / (Math.sqrt(c)));
        double secondFormula = Math.pow((a * a + b * b - Math.pow(c,3)), (a - b));

        double averageNumbers = (a + b + c) /3;
        double averageFormulas = (formula + secondFormula) /2;
        double diff = Math.abs(averageNumbers - averageFormulas);

        System.out.printf("F1 result: %.2f; ", formula);
        System.out.printf("F2 result: %.2f; ", secondFormula);
        System.out.printf("Diff: %.2f;", diff);

    }
}
