import java.util.Scanner;

public class F9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < numArray.length - 1; i++) {
            for (int j = 0; j < numArray.length - 1 - i; j++) {
                if (numArray[j] > numArray[j + 1]) {
                    int temp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = temp;
                }
            }
        }
        for (int i : numArray) {
            System.out.print(i + " ");
        }
    }
}
