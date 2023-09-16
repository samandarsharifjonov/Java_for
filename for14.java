import java.util.Scanner;
public class for14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for ( int i = 1; i<= 2 * n - 1; i+=2) System.out.println( sum += i);
    }
}