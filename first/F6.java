import java.util.Scanner;

public class F6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        for (int i = 1; i < n; i++) {
            if (i * i < n && (i + 1) * (i + 1) > n) {
                System.out.println(i);
            }
        }
    }
}
