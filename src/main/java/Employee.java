public class Employee {

    // Private instance variables
    private final int employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private final double hoursWorked;

    // Constructor
    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Derived getter: Regular hours (max 40)
    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    // Derived getter: Overtime hours
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    // Derived getter: Total pay
    // Overtime is paid at 1.5 times the pay rate
    public double getTotalPay() {
        return (getRegularHours() * payRate)
                + (getOvertimeHours() * payRate * 1.5);
    }
}