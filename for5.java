import java.util.Scanner;

public class for5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);

        double n = scanner.nextDouble();


        for ( int i = 1; i <= 10; i++){
            System.out.println(0.1 * (float) i + " " + 0.1 * (float) i * n);


        }


    }


}
