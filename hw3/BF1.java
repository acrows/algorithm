import java.util.Scanner;

public class BF1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (new StringBuffer(str).reverse().toString().equals(str))
            System.out.println("yes");
        else
            System.out.println("no");
        scanner.close();
    }
}
