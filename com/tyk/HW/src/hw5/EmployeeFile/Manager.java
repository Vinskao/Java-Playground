package hw5.EmployeeFile;

public class Manager extends AbstractPermanentEmployee {

    protected static final int bonus = 2000000;
    protected static final int commuteAllowance = 3000;
    private int totalSalary;
    public Manager(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    @Override
    public void giveSalary(){
        int Salary = getSalary();
        this.totalSalary = this.bonus + this.commuteAllowance + Salary + lunchAllowance;
    }
    public int getTotalSalary() {
        return totalSalary;
    }
}
