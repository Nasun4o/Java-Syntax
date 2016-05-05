import java.util.Scanner;

/**
 * Created by PC-PC on 3/21/2016.
 */
public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String number = console.next();

       Integer result = Integer.valueOf(number, 7);
        System.out.println(result);
    }
}
