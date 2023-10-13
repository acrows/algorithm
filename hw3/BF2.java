import java.util.Scanner;

public class BF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String subStr = scanner.next();
        System.out.println(str.indexOf(subStr));
        scanner.close();
    }
}
