
import java.util.Scanner;

public class for18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        int a = scanner.nextInt();
        double sum = 1;

        for (int i = 1; i <= n ; i++) {

            sum += Math.pow(-1, i) * Math.pow(a,i);

        }


        System.out.println(sum);





    }


}