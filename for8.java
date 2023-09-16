import java.util.Scanner;


public class for8 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int sum = 1;


        for ( double i = a; i <= b; i++){
            sum *=i;
        }

        System.out.println(sum);
    }
}
