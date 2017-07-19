package Train.Strings;

/**
 * Created by thien on 19/07/2017.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

class pattermsyntaxchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        while (testCases > 0) {
            String pattern = sc.nextLine();
            try {
                Pattern pat = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}