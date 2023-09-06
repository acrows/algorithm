import java.util.Scanner;

public class F5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            StringBuilder number = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                    number.append(str.charAt(j));
                }
            }
            int num1 = Integer.parseInt(number.toString());
            System.out.println(num1 * 513);
        }
    }
}
