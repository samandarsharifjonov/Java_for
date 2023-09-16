import java.util.Scanner;

public class for16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double sum = 0;


        for (int i = 1; i <=n ; i++) {

            sum = Math.pow(a, i);

            System.out.println(i+" "+sum);

        }







    }

}
