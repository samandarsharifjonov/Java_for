import java.util.Scanner;

public class for4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);

        double n = scanner.nextDouble();


        for (int i = 1; i < 10; i+=0.1){
            System.out.println(i+" "+i*n);

        }


    }


}
