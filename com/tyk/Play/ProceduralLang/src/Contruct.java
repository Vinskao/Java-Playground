public class Contruct {
    int employeeId;
    String employeeName;
    public Contruct(int id, String name) {
        this.employeeId = id;
        this.employeeName = name;
    }
    public Contruct(){
    }
    public String toString() {
        return employeeId + " " + employeeName;
    }
    public static void main(String[] args) {
        Contruct e = new Contruct();
        e.employeeId = 444;
        e.employeeName = "Sorane";

        Contruct employee = new Contruct(111, "TY");
        Contruct mary = new Contruct(222, "Mary");
        System.out.println(employee);
        System.out.println(mary);
        System.out.println(e.employeeName + " " + e.employeeId);
    }
}
