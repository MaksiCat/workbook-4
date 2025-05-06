public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(String employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public String getName() {
        return name;
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    public void punchTimeCard(double time) {
        if (punchInTime == 0) {
            punchInTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            double worked = time - punchInTime;
            hoursWorked += worked;
            System.out.println(name + " punched out at " + time + ". Worked " + worked + " hours.");
            punchInTime = 0;
        }
    }
}
