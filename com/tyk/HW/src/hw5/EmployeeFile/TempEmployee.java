package hw5.EmployeeFile;

public class TempEmployee extends AbstractTempEmployee {
    public TempEmployee(int hourlyWage, String name, String sex, String email) {
        super(hourlyWage, name, sex, email);
    }
    public void giveSalary(){
        int tempSalary = this.getHourlyWage();
        System.out.println("Temp Employee $ " + tempSalary * 250 * 8);
        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
        System.out.println(name);
        System.out.println(sex);
        System.out.println(email);
    }
}
