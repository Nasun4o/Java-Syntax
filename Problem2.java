import java.util.Scanner;

/**
 * Created by PC-PC on 3/19/2016.
 */
public class Problem2 {

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            int aX = console.nextInt();
            int aY = console.nextInt();
            int bX = console.nextInt();
            int bY = console.nextInt();
            int cX = console.nextInt();
            int cY = console.nextInt();

            int result = aX * (bY - cY)+ bX *(cY - aY) + cX *( aY - bY);
            result /= 2;
            if (result <= 1){
                System.out.println(0);
            }else {

                System.out.println(result);
            }
        }
}
