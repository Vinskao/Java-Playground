package hw5.EmployeeFile;

public abstract class Employee {
    private String name;
    private String sex;
    private String email;
    public Employee(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getEmail(){
        return email;
    }
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void giveSalary(){

    }
}
