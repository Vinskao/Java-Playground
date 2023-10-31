package hw5.EmployeeFile;

public class TempEmployee extends AbstractTempEmployee {
    public TempEmployee(int hourlyWage, String name, String sex, String email) {
        super(hourlyWage, name, sex, email);
    }
    private int totalSalary;
    public void giveSalary(){
        int tempSalary = this.getHourlyWage();
        int tempEmpSalary = tempSalary * 250 * 8;
        this.totalSalary = tempEmpSalary;
    }
    public int getTotalSalary() {
        return totalSalary;
    }
    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }
}
