import java.util.Scanner;

public class for11 {


    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       int sum = 0;

       for ( int i = 0; i <= n; i++){

           sum += ((n + i) * (n + i));

       }

        System.out.println(sum);













    }

}
