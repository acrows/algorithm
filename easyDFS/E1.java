import java.util.Scanner;

public class E1 {
    private final static int N = 11;
    private static int n;
    private final static int[] ans = new int[N];
    private static final int[] use = new int[N];
    private static int flag;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ans[1] = 1;
        use[1] = 1;
        circle(2);
        if (flag == 0)
            System.out.println("No Solution");
    }

    private static void circle(int m) {
        int j, k;
        if (m == n + 1) {
            flag = 1;
            for (j = 1; j <= n; j++) {
                System.out.print(ans[j]+" ");
            }
            System.out.println();
            return;
        }
        for (k = 2; k <= n; k++) {
            if (use[k] == 0 && IsPrime(k + ans[m - 1]) == 1) {
                if (m == n && IsPrime(k + 1) == 0)
                    continue;
                use[k] = 1;
                ans[m] = k;
                circle(m + 1);
                use[k] = 0;
            }
        }
    }

    private static int IsPrime(int m) {
        int q;
        for (q = 2; q <= Math.sqrt(m); q++) {
            if (m % q == 0)
                return 0;
        }
        return 1;
    }
}




