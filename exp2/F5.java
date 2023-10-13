import java.math.BigInteger;
import java.util.Scanner;

public class F5 {
    private static BigInteger fib(int n) {
        if (n == 1) {
            return new BigInteger("1");
        } else if (n == 2) {
            return new BigInteger("1");
        } else {
            BigInteger res = new BigInteger("0");
            BigInteger n1 = new BigInteger("1");
            BigInteger n2 = new BigInteger("1");
            for (int i = 3; i <= n; i++) {
                res = n1.add(n2);
                n1 = n2;
                n2 = res;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.print(fib(n));
        }
    }
}


