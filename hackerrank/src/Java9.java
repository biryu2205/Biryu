/**
 * Created by thien on 14/07/2017.
 */
//Java End-of-file

import java.util.Scanner;

public class Java9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (scan.hasNext()) {
            String s = scan.nextLine();
            i++;
            System.out.printf("%d %s \n", i, s);

        }
    }
}