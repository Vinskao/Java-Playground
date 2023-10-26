package hw5.Employee;

public class SalesEmployee extends AbstractPermanentEmployee{
    public SalesEmployee(int salary, String name, String sex, String email) {
        super(salary, name, sex, email);
    }
    private int salesBonus;
    public void setSalesBonus(int salesBonus){
        this.salesBonus = salesBonus;
    }
    public void giveSalary(){
        int salary = this.getSalary();
        int salesSalary = salary + lunchAllowance + this.salesBonus;
        String name = this.getName();
        String sex = this.getSex();
        String email = this.getEmail();
        System.out.println("Sales Employee $" + salesSalary);
        System.out.println(name);
        System.out.println(sex);
        System.out.println(email);
    }
}
