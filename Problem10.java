import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PC-PC on 3/22/2016.
 */
public class Problem10
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstString = console.nextLine();
        String secondString = console.nextLine();

        }
    static int productOfStrings(String firstString, String secondString){
        int product = 0;

        if (firstString.length() == secondString.length()){
            for (int i = 0; i < firstString.length(); i++) {
                product += firstString.charAt(i) * secondString.charAt(i);
            }
        }else if (firstString.length() > secondString.length()){
            for (int i = 0; i < secondString.length(); i++) {
                product += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = secondString.length(); i < firstString.length() ; i++) {
                product += firstString.charAt(i);
            }
        }else{
            for (int i = 0; i < firstString.length(); i++) {
                product += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                product += secondString.charAt(i);
            }
        }
        return product;
    }
}

