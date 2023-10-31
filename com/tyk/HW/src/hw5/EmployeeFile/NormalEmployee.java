package hw5.EmployeeFile;

public class NormalEmployee extends AbstractPermanentEmployee {
    private int totalSalary;
    public NormalEmployee(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }

    public void giveSalary(){
        int Salary = getSalary();
//        int normalSalary = Salary + lunchAllowance;
        this.totalSalary = Salary + lunchAllowance;

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
    }
    public int getTotalSalary() {
        return totalSalary;
    }
    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }
}
