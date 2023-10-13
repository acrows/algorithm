import java.util.Scanner;

public class E1 {
    private int[] ans;
    private static int n;
    private static final boolean[] use = new boolean[12];
    private static boolean flag;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E1 e1 = new E1();
        int N = scanner.nextInt();
        n = N;
        e1.ans = new int[N + 1];
        e1.ans[1] = 1;
        use[1] = true;
        e1.circle(2);
        if (!flag)
            System.out.println("No Solution");
    }

    private void circle(int m) {
        int k;
        if (m == n + 1) {
            flag = true;
            print(ans);
            return;
        }
        for (k = 2; k <= n; k++) {
            if (!(use[k] || IsPrime(k + ans[m - 1]))) {
                if (m == n && IsPrime(k + 1))
                    continue;
                use[k] = true;
                ans[m] = k;
                circle(m + 1);
                use[k] = false;
            }
        }
    }

    private static boolean IsPrime(int m) {
        int q;
        for (q = 2; q <= Math.sqrt(m); q++)
            if (m % q == 0)
                return true;
        return false;
    }

    private static void print(int[] ans) {
        for (int j = 1; j <= n; j++)
            System.out.print(ans[j] + " ");
        System.out.println();
    }
}





