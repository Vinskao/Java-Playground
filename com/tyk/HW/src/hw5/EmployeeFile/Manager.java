package hw5.EmployeeFile;

public class Manager extends AbstractPermanentEmployee {

    protected static final int bonus = 2000000;
    protected static final int commuteAllowance = 3000;
    public Manager(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    @Override
    public void giveSalary(){
        int Salary = getSalary();
        int managerSalary = this.bonus + this.commuteAllowance + Salary + lunchAllowance;

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
    }
}
