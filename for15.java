import java.util.Scanner;

public class for15 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in);


        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double sum = 1;


        for ( int i = 1; i <= n; i++){

            sum *= a;

        }

        System.out.println(sum);



    }


}