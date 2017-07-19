package Train.Introductions; /**
 * Created by thien on 14/07/2017.
 */
// Java Stdin and Stdout I
import java.util.Scanner;

public class javaStdinandStdoutI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
