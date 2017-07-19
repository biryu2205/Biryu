package Train.Introductions; /**
 * Created by thien on 14/07/2017.
 */
//Java Loops II

import java.util.Scanner;

class javaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int term, i, sum;
        while (test > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = 0;
            for (i = 0; i < n; i++) {
                term = (a + ((1 << i) * b));
                sum = sum + term;
                System.out.print(sum + " ");
                sum = sum - a;
            }
            System.out.println();
        }
    }
}
