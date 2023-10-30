package hw5.EmployeeFile;

public class NormalEmployee extends AbstractPermanentEmployee {
    public NormalEmployee(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    public void giveSalary(){
        int Salary = getSalary();
        int normalSalary = Salary + lunchAllowance;

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
    }
}
