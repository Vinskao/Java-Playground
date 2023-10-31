package hw5.EmployeeFile;

public class SalesEmployee extends AbstractPermanentEmployee {
    public SalesEmployee(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    protected static final int salesBonus = 1000000;
    private int totalSalary;
    public void giveSalary(){
        int salary = this.getSalary();
        this.totalSalary = salary + lunchAllowance + this.salesBonus;
    }
    public int getTotalSalary() {
        return totalSalary;
    }
    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }
}
