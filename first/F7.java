import java.util.Scanner;

public class F7 {
    static class Stu {
        String name;
        int grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stu[] stus = new Stu[n];
        for (int i = 0; i < n; i++) {
            Stu stu = new Stu();
            stu.name = scanner.next();
            stu.grade = scanner.nextInt();
            stus[i] = stu;
        }
        sort(stus);
        for (int i = 0; i < n; i++) {
            System.out.printf("%15s%5d\n", stus[i].name, stus[i].grade);
        }
    }

    private static void sort(Stu[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].grade < stus[j + 1].grade) {
                    Stu temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }

    }
}
