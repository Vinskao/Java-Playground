package hw5.Employee;

public class TempEmployee extends AbstractTempEmployee{
    public TempEmployee(int hourlyWage, String name, String sex, String email) {
        super(hourlyWage, name, sex, email);
    }
    public void giveSalary(){
        int tempSalary = this.getHourlyWage();

        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();

        System.out.print(name + " ");
        System.out.print(sex + " ");
        System.out.print(email + " ");
        System.out.println("Temp Employee $ " + tempSalary * 250 * 8);
    }
}
