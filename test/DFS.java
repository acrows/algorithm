import java.util.*;

public class DFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> partitions = partition(N);
        partitions.sort((a, b) -> sum(b) - sum(a));
        for (List<Integer> partition : partitions) {
            System.out.print(N + "=");
            for (int i = partition.size() - 1; i >= 1; i--)
                System.out.print(partition.get(i) + "+");
            System.out.println(partition.get(0));
        }
    }

    public static List<List<Integer>> partition(int N) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        result.add(Collections.singletonList(N));
        if (N == 1) {
            result.add(Collections.singletonList(1));
            return result;
        }
        for (int i = N - 1; i >= 1; i--) {
            if (N >= i) {
                List<List<Integer>> subPartitions = partition(N - i);
                for (List<Integer> partition : subPartitions) {
                    List<Integer> newPartition = new ArrayList<>(partition);
                    newPartition.add(i);
                    Collections.sort(newPartition);
                    String partitionStr = getStringRepresentation(newPartition);
                    if (!seen.contains(partitionStr)) {
                        result.add(newPartition);
                        seen.add(partitionStr);
                    }
                }
            }
        }
        return result;
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list)
            sum += num;
        return sum;
    }

    public static String getStringRepresentation(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list)
            sb.append(num).append(",");
        return sb.toString();
    }
}