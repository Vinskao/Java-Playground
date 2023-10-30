package hw5.Employee;
public class Manager extends AbstractPermanentEmployee {
    private int bonus;
    protected static final int commuteAllowance = 3000;

    public Manager(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    @Override
    public void giveSalary(){
        int Salary = getSalary();
        int managerSalary = this.bonus + commuteAllowance + Salary + lunchAllowance;

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();

        System.out.print(name + " ");
        System.out.print(sex + " ");
        System.out.print(email + " ");
        System.out.println("Manager $ "+ managerSalary);
    }
}
