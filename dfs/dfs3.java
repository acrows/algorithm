import java.util.Scanner;

public class dfs3 {
    private static final int[] b = new int[5];
    private static final int[] r = new int[5];
    private static final int[] a = new int[5];
    private static final boolean[] f = new boolean[5];

    private static void print(int k) {
        for (int i = 1; i <= k; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }

    private static void dfs(int k) {
        for (int i = 1; i <= 3; i++) {
            if (!f[i]) {
                r[k] = b[i];
                f[i] = true;
                //dfs的递进
                if (k < 3) dfs(k + 1);
                else print(k);
                f[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            a[i] = scanner.nextInt();
        }
        for (int k = 4; k >= 1; k--) {
            int t = 0;
            for (int i = 1; i <= 4; i++) {
                if (i != k) {
                    t++;
                    b[t] = a[i];
                }
            }

            for (int i = 1; i <= 3; i++) {
                f[i] = true;
                r[1] = b[i];
                dfs(2);
                f[i] = false;
            }
        }
    }
}


