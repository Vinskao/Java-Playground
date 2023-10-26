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
        System.out.println("Manager $ "+ managerSalary);

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
        System.out.println(name);
        System.out.println(sex);
        System.out.println(email);
    }
}
