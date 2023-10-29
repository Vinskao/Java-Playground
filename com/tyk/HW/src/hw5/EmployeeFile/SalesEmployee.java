package hw5.EmployeeFile;

public class SalesEmployee extends AbstractPermanentEmployee {
    public SalesEmployee(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    protected static final int salesBonus = 1000000;
    public void giveSalary(){
        int salary = this.getSalary();
        int salesSalary = salary + lunchAllowance + this.salesBonus;

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
    }
}
