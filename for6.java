import java.util.Scanner;

public class for6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        for ( double i = 1.2; i<=2; i+=0.2){
            System.out.println(i*n);
        }
    }
}
