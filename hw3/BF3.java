import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BF3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Stu[] stus1 = new Stu[n];
            Stu[] stus2 = new Stu[n];
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                int grade = scanner.nextInt();
                stus1[i] = new Stu(name, grade);
            }
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                int grade = scanner.nextInt();
                stus2[i] = new Stu(name, grade);
            }
            bubbleSort(stus1);
            if (check(stus2)) {
                System.out.println("Error");
                print(stus1);
            } else if (Arrays.equals(stus1, stus2))
                System.out.println("Right");
            else {
                System.out.println("Not Stable");
                print(stus1);
            }
        }
        scanner.close();
    }

    private static void bubbleSort(Stu[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getGrade() < arr[j + 1].getGrade()) {
                    Stu temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    private static boolean check(Stu[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i].getGrade() < arr[i + 1].getGrade())
                return true;
        return false;
    }

    private static void print(Stu[] arr) {
        for (Stu stu : arr) System.out.println(stu.getName() + " " + stu.getGrade());
    }
}

class Stu {
    private String name;
    private int grade;

    public Stu() {
    }

    public Stu(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stu stu = (Stu) o;
        return grade == stu.grade && Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
