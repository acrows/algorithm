import java.util.Scanner;

public class GCD {
    private int gcd1(int num1, int num2) {
        while (num2 != 0) {
            int i = num1 % num2;
            num1 = num2;
            num2 = i;
        }
        return num1;
    }

    private int gcd2(int num1, int num2) {
        while (true) {
            if (num1 < num2) {
                num1 = num1 ^ num2;
                num2 = num1 ^ num2;
                num1 = num1 ^ num2;
            }
            if (num1 - num2 == 0) {
                return num2;
            } else {
                int tmp = num1 - num2;
                num1 = num2;
                num2 = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCD gcd = new GCD();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int answer = gcd.gcd2(num1, num2);
        System.out.println(answer);
    }
}
