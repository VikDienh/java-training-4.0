public class ContractedEmployee extends Employee {
    protected String federalTaxId;
    protected double hourlyRate;
    protected double numberOfHoursWorked;// TODO fix class declaration and declare variables here

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId; // TODO fill in code here
    }

    public String getFederalTaxId() {
        return federalTaxId;// TODO fill in code here and replace the return statement
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;// TODO fill in code here
    }

    public double getHourlyRate() {
        return hourlyRate;// TODO fill in code here and replace the return statement
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;// TODO fill in code here
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;// TODO fill in code here and replace the return statement
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked; // TODO fill in code here
    }

    // TODO fill in code here
    @Override
    public void calculatePay() {
        this.averageMonthlySalary = hourlyRate * numberOfHoursWorked;
    }



}