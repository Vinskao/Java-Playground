package hw5.EmployeeFile;
import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) {
        File input = new File("src/hw5/EmployeeFile/input.txt");
        Dao dao = new Dao(input);
        List<Bean> beanList = dao.getContent();
        List<Employee> employeeList = new ArrayList<>();//存储的对象类型必须是 Employee 或其子类

        for (Bean bean : beanList){
            int typeEmp = bean.getTypeEmp();
            String name = bean.getName();
            String sex = bean.getSex();
            String email = bean.getEmail();
            int baseSalary = bean.getBaseSalaryInput();
            int HourlyWage = bean.getHourlyWage();
            Employee employee = null;

            if(typeEmp == 1){
                Manager manager = new Manager(baseSalary,name,sex,email);
                manager.giveSalary();
                employee = manager;
            } else if (typeEmp == 2){
                NormalEmployee normalEmployee = new NormalEmployee(baseSalary,name,sex,email);
                normalEmployee.giveSalary();
                employee = normalEmployee;
            } else if (typeEmp == 3){
                SalesEmployee salesEmployee = new SalesEmployee(baseSalary,name,sex,email);
                salesEmployee.giveSalary();
                employee = salesEmployee;
            } else if (typeEmp == 4){
                TempEmployee tempEmployee = new TempEmployee(HourlyWage,name,sex,email);
                tempEmployee.giveSalary();
                employee = tempEmployee;
            }
            employeeList.add(employee);
        }
        System.out.println(beanList);
//        System.out.println(employeeList);
    }
}
//1=manager 2=normal 3=sales 4=temp