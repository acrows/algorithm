import java.util.Arrays;
import java.util.Scanner;

public class dfs2 {

    private static int[] a;
    private static int[] nums;
    private static boolean[] b;

    private static void dfs(int x) {
        if (x == a.length) {
            for (int j : nums) {
                System.out.print(j + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!b[i]) {
                nums[x] = a[i];
                b[i] = true;
                dfs(x + 1);
                b[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            a = new int[num];
            b = new boolean[num];
            nums = new int[num];
            for (int i1 = 0; i1 < num; i1++) {
                a[i1] = scanner.nextInt();
            }
            Arrays.sort(a);
            dfs(0);
        }
    }

}
