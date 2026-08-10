import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++)
                row.add(sc.nextInt());

            list.add(row);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x <= list.size() && y <= list.get(x - 1).size())
                System.out.println(list.get(x - 1).get(y - 1));
            else
                System.out.println("ERROR!");
        }
    }
}

Your Output (stdout)
74
52
37
ERROR!
ERROR!
Expected Output
74
52
37
ERROR!
ERROR!