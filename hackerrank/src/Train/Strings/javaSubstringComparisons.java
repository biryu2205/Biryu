package Train.Strings; /**
 * Created by thien on 18/07/2017.
 */

import java.util.Scanner;

public class javaSubstringComparisons {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int k = sc.nextInt();
    sc.close();

    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

    for (int i = 0; i <= s.length() - k; i++) {
      String curr = s.substring(i, i + k);
      if (smallest.compareTo(curr) > 0) {
        smallest = curr;
      }
      if (largest.compareTo(curr) < 0) {
        largest = curr;
      }
    }
    System.out.println(smallest);
    System.out.println(largest);
  }
}