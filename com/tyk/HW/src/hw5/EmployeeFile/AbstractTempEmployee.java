package hw5.EmployeeFile;

public abstract class AbstractTempEmployee extends Employee {
    private int hourlyWage;
    public AbstractTempEmployee(int hourlyWage, String name, String sex, String email){
        super(name, sex, email);
        this.hourlyWage = hourlyWage;
    }
    public int getHourlyWage(){
        return hourlyWage;
    }
    @Override
    public void giveSalary(){
    }
}
