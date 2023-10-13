import java.util.Scanner;

public class E1 {
    private static int m;

    private static final int N = 15;

    private static final int[] a = new int[N];

    private static final boolean[] b = new boolean[N];
    private static int count = 0;

    private static void dfs(int x) {
        if (x == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            count++;
            return;
        }
        for (int i = 1; i <= m; i++) {
            if (!b[i]) {
                a[x] = i;
                b[i] = true;
                dfs(x + 1);
                b[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        dfs(0);
        System.out.println("Total=" + count);
    }
}


