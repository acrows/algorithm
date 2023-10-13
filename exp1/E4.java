import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E4 {
    private void print(List<Integer> lists) {
        for (Integer i : lists) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        E4 e4 = new E4();
        int n = scan.nextInt();
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            lists.add(i);
        }
        lists.set(1, 0);
        int s = (int) Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (lists.get(i) != 0) {
                int a = i * i;
                while (a <= n) {
                    lists.set(a, 0);
                    a += i;
                }
            }
        }
        e4.print(lists);
    }
}

