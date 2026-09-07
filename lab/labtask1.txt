import java.util.Scanner;

public class SalaryTransformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate allowances
        double hra = basicSalary * 0.20;  // 20% HRA
        double da = basicSalary * 0.10;   // 10% DA

        // Gross salary
        double grossSalary = basicSalary + hra + da;

        // Deduction
        double pf = basicSalary * 0.12;   // 12% PF

        // Net salary
        double netSalary = grossSalary - pf;

        // Display result
        System.out.println("\n----- Salary Details -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("PF (12%)      : " + pf);
        System.out.println("Net Salary    : " + netSalary);

        sc.close();
    }
}