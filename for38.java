import java.util.Scanner;

public class for38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int j=1;

        for (int i = n; i>=1 ; i--) {

            if ( j <= n){

                sum += Math.pow(j,i);
                j++;
            }

        }

        System.out.println(sum);


    }


}
