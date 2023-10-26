package hw5.Employee;

public class NormalEmployee extends AbstractPermanentEmployee{
    public NormalEmployee(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    public void giveSalary(){
        int Salary = getSalary();
        int normalSalary = Salary + lunchAllowance;

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();

        System.out.print(name + " ");
        System.out.print(sex + " ");
        System.out.print(email + " ");
        System.out.println("Normal Employee $ "+ normalSalary);

    }
}
