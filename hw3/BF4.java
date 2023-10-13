import java.util.Scanner;

public class BF4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("no");
            return;
        }
        for (int i = 0; str1.charAt(i) != '#'; i++) {
            if (str1.charAt(i) != str2.charAt(i))
                if (str1.charAt(i) == '*' || str2.charAt(i) == '*') {
                    if (str1.charAt(i) == ' ' || str2.charAt(i) == ' ') {
                        System.out.println("no");
                        return;
                    }
                }
        }
        System.out.println("yes");
        scanner.close();
    }
}
