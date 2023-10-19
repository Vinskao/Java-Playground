package Employee;

public class Employee {
    private int empno;
    private String name;
    private static int count;
    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee (int empno, String name){
        this.empno = empno;
        this.name = name;
        count++;
    }
    public static int getCount(){
        return count;
    } //因為是計算數，不能set
    public void printData(){
        System.out.println(name);
        System.out.println(empno);
    }
}
