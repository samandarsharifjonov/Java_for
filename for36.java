import java.util.Scanner;

public class for36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <=n ; i++) {

            sum += Math.pow(i,k);
        }

        System.out.println(sum);



    }


}
