package hw5.EmployeeFile;

public class SalesEmployee extends AbstractPermanentEmployee {
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

        System.out.print(name + " ");
        System.out.print(sex + " ");
        System.out.print(email + " ");
        System.out.println("Sales Employee $ " + salesSalary);

    }
}
