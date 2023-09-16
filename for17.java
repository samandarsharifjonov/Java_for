import java.util.Scanner;

public class for17 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in);


        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double sum = 1;


        for ( double i = 1; i <= n; i++){

            sum += Math.pow( a, i);

        }

        System.out.println(sum);



    }


}