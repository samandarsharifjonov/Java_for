import java.util.Scanner;

public class for3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        if ( a < b){
            for (int i=b-1; i>a;--i) {
                sum++;
                System.out.print(i+" ");

            }
            System.out.print(""+sum);







        }




    }

}
