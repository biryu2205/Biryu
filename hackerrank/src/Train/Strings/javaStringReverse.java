package Train.Strings;

/**
 * Created by thien on 19/07/2017.
 */

import java.util.Scanner;

public class javaStringReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.next();

    System.out.println(new StringBuilder(A).reverse().toString().equals(A) ? "Yes" : "No");

    sc.close();
  }
}

