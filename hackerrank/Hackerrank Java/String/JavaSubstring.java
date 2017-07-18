package String; /**
 * Created by thien on 18/07/2017.
 */

import java.util.Scanner;

class JavaSubstring {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    System.out.println(S.substring(start, end));
  }
}

