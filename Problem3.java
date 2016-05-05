import java.util.Scanner;

/**
 * Created by PC-PC on 3/19/2016.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();

        String result = Integer.toHexString(a).toString();
        String resultIntBinary = Integer.toBinaryString(a);

        System.out.printf("|%s       |%010d|         %10.2f|%10.3f      |",
                result.toUpperCase(), Integer.parseInt(resultIntBinary), b, c);

    }
}

