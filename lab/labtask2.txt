import java.util.Scanner;

public class RealTimeStreamAnalyticsEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of data values: ");
        int n = sc.nextInt();

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter the data values:");

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();

            sum += value;

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }

            double average = (double) sum / i;

            System.out.println("After value " + i +
                    " -> Average: " + average +
                    ", Maximum: " + max +
                    ", Minimum: " + min);
        }

        System.out.println("\n----- Final Analytics -----");
        System.out.println("Total Values : " + n);
        System.out.println("Sum          : " + sum);
        System.out.println("Average      : " + ((double) sum / n));
        System.out.println("Maximum      : " + max);
        System.out.println("Minimum      : " + min);

        sc.close();
    }
}