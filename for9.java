import java.util.Scanner;

public class for9 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for ( double i = a; i <= b; i++){
            sum += (i*i);

        }

        System.out.println(sum);



    }

}
