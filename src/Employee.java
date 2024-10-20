abstract class Employee implements Payable {
        protected String employeeId;
        protected String name;
        protected double averageMonthlySalary;

    // fix class declaration and declare variables here

    protected Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name; // fill in code here
    }

    public String getEmployeeId() {
        return employeeId; // fill in code here and replace the return statement
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId; // fill in code here
    }

    public String getName() {
        return name; // fill in code here and replace the return statement
    }

    public void setName(String name) {
        this.name = name;// fill in code here
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary; // fill in code here and replace the return statement
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "EmployeeID " + employeeId + ", Name" + name + ", Average Monthly Salary" + averageMonthlySalary + String.format("%.2f", averageMonthlySalary);
        // fill in code here and replace the return statement, be sure to format double value
    }
}