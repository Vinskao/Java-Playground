package Employee;
import static Employee.Employee.getCount;
import static Employee.StaticBlock.count1;
import static Employee.StaticBlock.getCount1;

public class test {
    public static void main(String[] args) {
        Employee[] emps = new Employee[3];
        emps[0] = new Employee(111, "TY");
        emps[1] = new Employee(112, "Sorane");
        emps[2] = new Employee(113, "Sayuri");
        for (Employee emp: emps){
            emp.printData();
        }
        StaticBlock sb = new StaticBlock();
        sb.num++;
        sb.count1++; //通过对象 sb 访问静态变量 count1 并增加它的值。这种方式虽然合法，但通常不建议这样做，因为静态变量应该通过类名来访问。
        StaticBlock.count1++; //通过类名 StaticBlock 直接访问 count1 并自增它，而不需要使用对象 sb 来调用静态成员方法
        //静态成员（静态变量和静态方法）属于类而不是实例。因此，它们不是与类的特定实例相关联的，而是与整个类相关联的
        System.out.println(count1);
        System.out.println(sb.num);
        System.out.println(getCount());
    }
}
