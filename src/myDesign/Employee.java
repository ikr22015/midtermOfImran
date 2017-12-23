package myDesign;

public interface Employee {
    //employeeId() will return employee id.
    public int employeeId();

    //employeeName() will return employee name
    public String employeeName();

    //assignDepartment() will assign employee to departments
    public void assignDepartment();

    //calculate employee salary
    public int calculateSalary(int salaryInHr);

    //employee benefit
    public void benefitLayout();
}
