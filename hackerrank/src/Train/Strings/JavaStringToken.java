package Train.Strings;

/**
 * Created by thien on 19/07/2017.
 */

import java.util.Scanner;

public class JavaStringToken {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] a = sc.nextLine().trim().split("[ !,?\\._'@]+", 0);
    if (a.length == 1 && a[0].equals("")) {
      System.out.println(0);
    } else {
      System.out.println(a.length);
      for (String s : a) System.out.println(s);
    }
  }
}