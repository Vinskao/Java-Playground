package hw5.Employee;

public class NormalEmployee extends AbstractPermanentEmployee{
    public NormalEmployee(int salary, int lunchAllowance, String name, String sex, String email) {
        super(salary, lunchAllowance, name, sex, email);
    }
    public void giveSalary(){
        int Salary = getSalary();
        int lunchAllowance = getLunchAllowance();
        int normalSalary = Salary + lunchAllowance;
        System.out.println("Normal Employee $ "+ normalSalary);
        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
        System.out.println(name);
        System.out.println(sex);
        System.out.println(email);
    }
}
