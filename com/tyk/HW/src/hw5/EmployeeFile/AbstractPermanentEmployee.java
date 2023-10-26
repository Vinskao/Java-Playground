package hw5.EmployeeFile;

public abstract class AbstractPermanentEmployee extends Employee {
    private int salary;
    protected static final int lunchAllowance = 2400;

    public AbstractPermanentEmployee(int salary, String name, String sex, String email){
        super(name, sex, email);
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void giveSalary(){

    }
}
