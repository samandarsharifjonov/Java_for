import java.util.Scanner;

public class for37 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <=n ; i++) {

            sum+=Math.pow(i,i);
        }

        System.out.println(sum);

    }
}
