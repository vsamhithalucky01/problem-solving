import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    static int[] count(ArrayList<Object> mylist) {
        int[] answer = new int[3];

        for (Object obj : mylist) {
            if (obj instanceof Student) {
                answer[0]++;
            }
            if (obj instanceof Rockstar) {
                answer[1]++;
            }
            if (obj instanceof Hacker) {
                answer[2]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Object> mylist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Student")) {
                mylist.add(new Student());
            }
            if (type.equals("Rockstar")) {
                mylist.add(new Rockstar());
            }
            if (type.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }

        int[] answer = count(mylist);

        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
    }
}