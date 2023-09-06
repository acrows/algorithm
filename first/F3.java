import java.util.Scanner;

public class F3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            triangle(number);
        }
    }

    private static void triangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int blank = 0; blank < i; blank++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
