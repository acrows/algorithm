import java.util.Scanner;

public class F8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(decToOct(n));
    }

    private static int decToOct(int n) {
        if (n < 8) return n;
        else return n % 8 + 10 * (decToOct(n / 8));
    }
}
