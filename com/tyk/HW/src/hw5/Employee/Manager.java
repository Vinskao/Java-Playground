package hw5.Employee;
public class Manager extends AbstractPermanentEmployee {
    public Manager(int salary, int lunchAllowance, String name, String sex, String email) {
        super(salary, lunchAllowance, name, sex, email);
    }
    private int bonus;
    private int commuteAllowance;
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public void setCommuteAllowance(int commuteAllowance){
        this.commuteAllowance = commuteAllowance;
    }
    public void giveSalary(){
        int Salary = getSalary();
        int lunchAllowance = getLunchAllowance();
        int managerSalary = this.bonus + this.commuteAllowance + Salary + lunchAllowance;
        System.out.println("Manager $ "+ managerSalary);
        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
        System.out.println(name);
        System.out.println(sex);
        System.out.println(email);
    }
}
