import java.util.Scanner;

/**
 * Created by PC-PC on 3/21/2016.
 */
public class Problem5 {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        int number = console.nextInt();

        System.out.print(Integer.toString(number, 7));
    }
}
