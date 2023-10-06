import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E4 {
    private static final List<Integer> current = new ArrayList<>();
    private static int N;

    public static void decompose(int n, int m) {
        dfs(n, m, 1);
    }

    private static void dfs(int n, int m, int start) {
        if (n == 0 && m == 0) {
            System.out.print(N + "=");
            for (int i = 0; i < current.size(); i++) {
                if (i == current.size() - 1) {
                    System.out.print(current.get(i));
                } else {
                    System.out.print(current.get(i) + "+");
                }
            }
            System.out.println();
            return;
        }
        if (n <= 0 || m <= 0) {
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            dfs(n - i, m - 1, i + 1);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        N = n;
        decompose(n, m);
    }
}