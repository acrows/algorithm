import java.util.Scanner;

public class E5 {

    private static int n;
    private static int last = 0;
    private static final int[] a = new int[12];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dfs(n, 1);
    }

    private static void dfs(int deep, int k) {
        if (deep == 0) {
            print();
            return;
        }
        int p;
        p = deep / 2;
        for (int i = k; i <= p; ++i) {
            last++;
            a[last] = i;
            dfs(deep - i, i);
            last--;
        }
        last++;
        a[last] = deep;
        dfs(0, deep);
        last--;
    }

    private static void print() {
        System.out.print(n + "=");
        for (int i = 1; i <= last - 1; ++i)
            System.out.print(a[i] + "+");
        System.out.println(a[last]);
    }
}

