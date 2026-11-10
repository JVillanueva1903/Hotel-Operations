import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(
                101,
                "John Smith",
                "Sales",
                20.00,
                45
        );

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        PrintStream printf = System.out.printf("Total Pay: $%.2f%n", emp.getTotalPay());
    }}
