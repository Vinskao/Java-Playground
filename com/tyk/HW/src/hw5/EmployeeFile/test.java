package hw5.EmployeeFile;

import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) {
        String strRead = null;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\VinsKao\\Desktop\\Java-Playground\\com\\tyk\\HW\\src\\hw5\\EmployeeFile\\input.txt"));
            FileInputStream fis = new FileInputStream("C:\\Users\\VinsKao\\Desktop\\Java-Playground\\com\\tyk\\HW\\src\\hw5\\EmployeeFile\\input.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\VinsKao\\Desktop\\Java-Playground\\com\\tyk\\HW\\src\\hw5\\EmployeeFile\\output.txt"));
            // input data to memory
            byte[] data = new byte[bis.available()];
            bis.read(data);
            strRead = new String(data);
            // 提取字串
            String delimiter = ",";
            String[] words = strRead.split(delimiter);
            // 傳輸字串
            int i = 0;
            int step = 1;
            int currentTerm = 0;
            while (i < words.length) {
                try {
                    int type = Integer.parseInt(words[i + currentTerm].trim());
                    String[] employeeData = Arrays.copyOfRange(words, i + currentTerm, i + currentTerm + 6);
                    if (type == 1) {
                        list1.add(Arrays.toString(employeeData));
                    } else if (type == 2) {
                        list2.add(Arrays.toString(employeeData));
                    } else if (type == 3) {
                        list3.add(Arrays.toString(employeeData));
                    } else if (type == 4) {
                        list4.add(Arrays.toString(employeeData));
                    } else {

                    }
                    currentTerm = currentTerm + step;
                    i += step;
                } catch (NumberFormatException e) {

                }
            }
            in.close();
            out.close();
            System.out.println("List 1:");
            for (String dataWord : list1) {
                System.out.println(dataWord);
            }
            // write output
            String str;
            while ((str = in.readLine()) != null) {
                out.write(str);
                out.newLine();
            }
            in.close();
            bis.close();
            fis.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strRead);

        Manager managerSalary = new Manager(1000000, "TY", "Male", "tianyikao@gmail.com");
        managerSalary.setBonus(2000000);
        managerSalary.giveSalary();
        NormalEmployee normalSalary = new NormalEmployee(700000, "Chiaki", "Female", "sackerchiaki@gmail.com");
        normalSalary.giveSalary();
        SalesEmployee salesSalary = new SalesEmployee(400000, "Sorane", "Female", "morichikusorane@gmail.com");
        salesSalary.setSalesBonus(1000000);
        salesSalary.giveSalary();
        TempEmployee tempSalary = new TempEmployee(200, "Tesar Z", "Female", "zztesar@gmail.com");
        tempSalary.giveSalary();
    }
}
//1=manager 2=normal 3=sales 4=temp