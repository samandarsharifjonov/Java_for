import java.util.Scanner;

public class for2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        if ( a < b) {

            for ( int i = a;  i <= b; i++) {

                sum++;


                System.out.print(i+" ");
            }

            System.out.print(""+sum);

        }else if ( b < a){

            for ( int i = a; i<=b; i--){

                sum--;

                System.out.println(i+" ");
            }

            System.out.println(""+sum);

        }
    }
}
