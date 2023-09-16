
import java.util.Scanner;

public class for20 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in);

        int n = scanner.nextInt();
        int sum2 = 0;

        for (int i = 1; i <=n ; i++) {

            int sum1 = 1;

            for (int j = 1; j <= i ; j++) {

                sum1 *= j;

            }

            sum2 += sum1;

        }


        System.out.println(sum2);

        /*
          int n = scanner.nextInt();

        int sum2 = 0;



        for (int i = 1; i <= n ; i++) {
            int sum1 = 1;

            for (int j = 1; j <=i ; j++) {

                sum1*=j;
            }

            sum2+=sum1;

        }

        System.out.println(sum2)
         */








    }


}