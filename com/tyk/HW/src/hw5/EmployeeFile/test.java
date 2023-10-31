package hw5.EmployeeFile;
import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) {
        File input = new File("/Users/vinskao/Desktop/Java-Playground/com/tyk/HW/src/hw5/EmployeeFile/input.txt");
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
//1=manager 2=normal 3=sales 4=temp
            if(typeEmp == 1){
                Manager manager = new Manager(baseSalary,name,sex,email);
                manager.giveSalary();
                int totalSalary = manager.getTotalSalary();
                bean.setTotalSalary(totalSalary);
            } else if (typeEmp == 2){
                NormalEmployee normalEmployee = new NormalEmployee(baseSalary,name,sex,email);
                normalEmployee.giveSalary();
                int totalSalary = normalEmployee.getTotalSalary();
                bean.setTotalSalary(totalSalary);
            } else if (typeEmp == 3){
                SalesEmployee salesEmployee = new SalesEmployee(baseSalary,name,sex,email);
                salesEmployee.giveSalary();
                int totalSalary = salesEmployee.getTotalSalary();
                bean.setTotalSalary(totalSalary);
            } else if (typeEmp == 4){
                TempEmployee tempEmployee = new TempEmployee(HourlyWage,name,sex,email);
                tempEmployee.giveSalary();
                int totalSalary = tempEmployee.getTotalSalary();
                bean.setTotalSalary(totalSalary);
            }
            employeeList.add(employee);
        }
        System.out.println(beanList);
    }
}