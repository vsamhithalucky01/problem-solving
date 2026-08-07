import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() > m) {
                int old = deque.removeFirst();
                map.put(old, map.get(old) - 1);

                if (map.get(old) == 0)
                    map.remove(old);
            }

            if (deque.size() == m)
                max = Math.max(max, map.size());
        }

        System.out.println(max);
    }
}