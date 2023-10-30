package hw5.EmployeeFile;

public class TempEmployee extends AbstractTempEmployee {
    public TempEmployee(int hourlyWage, String name, String sex, String email) {
        super(hourlyWage, name, sex, email);
    }

    public void giveSalary(){
        int tempSalary = this.getHourlyWage();
        int tempEmpSalary = tempSalary * 250 * 8;
        this.setSalary(tempEmpSalary);
        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
    }
}
