import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class F4 {
    static class Stu {
        String name;
        int num;
        int time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Stu> lists = new LinkedList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            for (int j = 0; j < num; j++) {
                Stu stu = new Stu();
                stu.name = scanner.next();
                stu.num = scanner.nextInt();
                stu.time = scanner.nextInt();
                if (!lists.isEmpty()) {
                    if (lists.get(0).num < stu.num) {
                        lists.clear();
                        lists.add(stu);
                    } else if (lists.get(0).num == stu.num) {
                        lists.add(stu);
                    }
                } else {
                    lists.add(stu);
                }

            }
            Stu first = lists.get(0);
            for (Stu s : lists) {
                if (s.time < first.time) {
                    first = s;
                }
            }
            System.out.println(first.name + " " + first.num + " " + first.time);
            lists.clear();
        }
    }
}
