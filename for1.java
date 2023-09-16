import java.util.Scanner;

public class for1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if ( n > 0) {

            for (int i = 1; i <= n; i++) {

                System.out.println(i + " " + k);
            }


        }
    }
}
