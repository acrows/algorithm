import java.util.Scanner;

public class E3 {
    private static int n;
    private static int m;

    private static final int N = 15;

    private static final int[] a = new int[N];

    private static final boolean[] b = new boolean[N];

    private static void dfs(int x) {
        if (x > m) {
            for (int i = 1; i <= m; i++) {
                System.out.print((char) (a[i] + 64));
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!b[i] && a[x - 1] < i) {
                a[x] = i;
                b[i] = true;
                dfs(x + 1);
                b[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        dfs(1);
        scanner.close();
    }
}



