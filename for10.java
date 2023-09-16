import java.util.Scanner;

public class for10 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        float sum = 0 ;
        float k = 1;


        for ( int i = 1; i <= n; i++){

            sum += (k/i);


        }




        System.out.println(sum);











    }

}
