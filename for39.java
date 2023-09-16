import java.util.Scanner;

public class for39 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <=b ; i++) {

            for (int j = 0; j <= i-1; j++) {

                System.out.print(i+" ");

            }
            System.out.println();

        }

    }

}
