package myDesign;

public class EmployeeInfo implements Employee {
    public int id = 0;
    public String name = "Default name";
    public String department = "Default department";
    public String joindDate = "Default Date";

    public EmployeeInfo(){

    }

    public EmployeeInfo(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int employeeId(){return id;}

    public String employeeName(){return name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getJoinDate() {
        return joindDate;
    }

    public void setJoindDate(String joindDate) {
        this.joindDate = joindDate;
    }



    public void assignDepartment(){

    }

    public int calculateSalary(int salaryInHr){
        int weeklySalary = (salaryInHr*40);
        int yearlySalary = (weeklySalary*52);

        return yearlySalary;
    }

    public void benefitLayout(){

    }

    public int calculateEmployeeBonus(int yearlySalary, Performance performance){
        int _totalBonus = 0;
        String _errorMess = "Error message";
        switch (performance){
            case Best:
                _totalBonus = (yearlySalary*10)/100;
                break;
            case Average:
                _totalBonus = (yearlySalary*8)/100;
                break;
                default:
                _errorMess = "Please put the correct word for performance -- Best or Average";
        }
        return _totalBonus;
    }

    /*public void calculateEmployeePension(){
        int salary = 15000;
        int pension = 0;

        LocalDate start = LocalDate.of(2017,9,7);
        //LocalDate end = LocalDate.of(2014, 2, 28); // use for age-calculation: LocalDate.now()
        LocalDate end = LocalDate.now();
        long jobAge = ChronoUnit.YEARS.between(start, end);


        if (jobAge<2){
            pension = (salary*5)/100;
            System.out.println(pension);
        }else if (jobAge>2){
            pension = (salary*10)/100;
            System.out.println(pension);
        }
    }*/
}
