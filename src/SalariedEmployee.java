public class SalariedEmployee extends Employee {
    protected String socialSecurityNumber;
    protected double fixedMonthlyPayment;
    // fix class declaration and declare variables here

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;// fill in code here
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber; // fill in code here and replace the return statement
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber; // fill in code here
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment; // fill in code here and replace the return statement
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;// fill in code here
    }

    @Override
    public void calculatePay() {
        this.averageMonthlySalary = fixedMonthlyPayment;
    }
}