package Train.Strings;

/**
 * Created by thien on 19/07/2017.
 */

import java.util.Scanner;

class JavaRegex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String IP = sc.next();
      System.out.println(IP.matches(new myRegex().pattern));
    }
  }
}

class myRegex {
  String pattern =
      "(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)";
}