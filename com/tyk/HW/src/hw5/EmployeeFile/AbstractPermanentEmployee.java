package hw5.EmployeeFile;

public abstract class AbstractPermanentEmployee extends Employee {
    private int salary;
    private int lunchAllowance;
    public AbstractPermanentEmployee(int salary, int lunchAllowance, String name, String sex, String email){
        super(name, sex, email); //不需要将参数用 String 包装，因为这些参数已经是 String 类型
        this.salary = salary;
        this.lunchAllowance = lunchAllowance;
    }
    public int getSalary(){
        return salary;
    }
    public int getLunchAllowance(){
        return lunchAllowance;
    }
    public void giveSalary(){
    }
}
