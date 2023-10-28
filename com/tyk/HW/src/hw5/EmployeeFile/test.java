package hw5.EmployeeFile;

import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) {
        File input = new File("/Users/vinskao/Desktop/Java-Playground/com/tyk/HW/src/hw5/EmployeeFile/input.txt");
        Dao dao = new Dao(input);
        List<Bean> list = dao.getContent();
//        System.out.println(list);

//        Manager managerSalary = new Manager(1000000, "TY", "Male", "tianyikao@gmail.com");
//        managerSalary.setBonus(2000000);
//        managerSalary.giveSalary();
//        NormalEmployee normalSalary = new NormalEmployee(700000, "Chiaki", "Female", "sackerchiaki@gmail.com");
//        normalSalary.giveSalary();
//        SalesEmployee salesSalary = new SalesEmployee(400000, "Sorane", "Female", "morichikusorane@gmail.com");
//        salesSalary.setSalesBonus(1000000);
//        salesSalary.giveSalary();
//        TempEmployee tempSalary = new TempEmployee(200, "Tesar Z", "Female", "zztesar@gmail.com");
//        tempSalary.giveSalary();
    }
}
//1=manager 2=normal 3=sales 4=temp