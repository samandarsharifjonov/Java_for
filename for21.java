import java.util.Scanner;

public class for21 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double sum2 = 1;


        for (int i = 1; i <=n ; i++) {
            double sum1 = 1;
            for (int j = 1; j <=i ; j++) {
                sum1*=j;
            }
            sum1=1/sum1;
            sum2+= sum1;
        }
        System.out.println(sum2);







    }



}
