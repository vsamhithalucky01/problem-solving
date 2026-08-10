import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() { return id; }
    String getName() { return name; }
    double getCGPA() { return cgpa; }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> {
            if (a.getCGPA() != b.getCGPA())
                return Double.compare(b.getCGPA(), a.getCGPA());

            int x = a.getName().compareTo(b.getName());
            if (x != 0) return x;

            return a.getID() - b.getID();
        });

        for (String e : events) {
            String[] s = e.split(" ");

            if (s[0].equals("ENTER")) {
                pq.add(new Student(
                    Integer.parseInt(s[3]),
                    s[1],
                    Double.parseDouble(s[2])
                ));
            } else if (!pq.isEmpty()) {
                pq.poll();
            }
        }

        List<Student> ans = new ArrayList<>();
        while (!pq.isEmpty())
            ans.add(pq.poll());

        return ans;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> events = new ArrayList<>();

        for (int i = 0; i < n; i++)
            events.add(sc.nextLine());

        List<Student> result = new Priorities().getStudents(events);

        if (result.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student s : result)
                System.out.println(s.getName());
        }
    }
} 

Output (stdout)
Dan
Ashley
Shafaet
Maria
Expected Output
Dan
Ashley
Shafaet
Maria