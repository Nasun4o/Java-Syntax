import java.util.*;

/**
 * Created by PC-PC on 3/21/2016.
 */
public class Problem11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Chose 1 for first array and 2 for the second");
        int chose = console.nextInt();
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {11, 6, 2, 8, 1, 0};
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        String even1 =new String();
        if (chose == 1) {


            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    odd.add(array[i]);
                }
            }
            System.out.printf("Odd: %s", odd.toString());
        }else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] % 2 == 0) {
                    even.add(array1[i]);
                }
            }
            System.out.printf("Even: %s", even.toString());
        }
    }
}
