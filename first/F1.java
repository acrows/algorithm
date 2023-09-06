import java.util.Scanner;

public class F1 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int sum = 0;
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
