import java.util.Scanner;

public class for13 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in);

        int   n = scanner.nextInt();
        double sum = 0;
        double k = 1.1;


        for ( int  i = 1; i <= n;){

            sum += k;

            for ( ; k < 0 ;){

                k-=0.1;

                break;
            }


            for ( ; k > 0 ;){

                k+=0.1;

                break;

            }
            k = k * (-1);
            n--;
        }





        System.out.println(sum);




    }


}
