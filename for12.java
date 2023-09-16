import java.util.Scanner;

public class for12 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in);

        int  n = scanner.nextInt();
        double sum = 1;
        double k = 1.1;


        for (int i = 1; i<=n; i++){

            sum = sum * k;
            k = k + 0.1;

        }

        System.out.println(sum);









    }


}
