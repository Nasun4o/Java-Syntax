import java.util.Random;
import java.util.Scanner;

/**
 * Created by PC-PC on 3/19/2016.
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int max = console.nextInt();

        Random rnd = new Random();
        int numbers = rnd.nextInt(max - min) + min;

        System.out.println(numbers);
    }
}
