import java.util.Scanner;

public class E3 {
    private static int m;
    private static final int N = 15;
    private static final char[] a = new char[N];

    private static void dfs(int x) {
        if (x == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= m; i++) {
            a[x] = (char) (i + 64);
            dfs(x + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        dfs(0);
    }
}
