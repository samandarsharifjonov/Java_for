import java.util.Scanner;

public class for22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float x = scanner.nextFloat();

        float s = 1;
        int fact = 1;


        for (int i = 1; i <=n ; i++) {

                fact *= i;
                s += Math.pow(x,i)/fact;

        }


        System.out.println(s);




















    }




}
