package hw5.EmployeeFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
//.txt to string to list with (string to array)
public class Dao {
    private List<Bean> content; //List中存储的元素类型是Bean
    public List<Bean> getContent() {
        return this.content;
    }
    public void setContent(List<Bean> content) {
        this.content = content;
    }
    public Dao(File input) {  //讀取資料放入list
        this.content = this.loadFile(input);
    }
    private List<Bean> loadFile(File input){ //讀取txt並寫入string再寫入list
        if (input == null){
            return null;
        }
        List result = new ArrayList<>();
        String line = null; //將讀取好的值放入string中
        try (BufferedReader in = new BufferedReader(new FileReader("src/hw5/EmployeeFile/input.txt")))
        {
            line = in.readLine();
            while (line != null){
                System.out.println(line);
                System.out.println(result);
                Bean bean = this.parseString(line);
                result.add(bean);
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    private Bean parseString(String line) throws ParseException { //string放入array後設屬性
        if (line != null) {
            String[] array = line.split(","); //將分割的string放入array中
            if (array != null && array.length == 7) {
                int typeEmp = Integer.parseInt(array[0]);
                int baseSalary = Integer.parseInt(array[1]);
                int bonus = Integer.parseInt(array[5]);
                int hourlyWage = Integer.parseInt(array[6]);
                //調用Bean.java的設屬性能力
                Bean bean = new Bean();
                bean.setTypeEmp(typeEmp);
                bean.setBaseSalaryInput(baseSalary);
                bean.setHourlyWage(hourlyWage);
                bean.setName(array[2]);
                bean.setSex(array[3]);
                bean.setEmail(array[4]);
                bean.setBonus(bonus);
                System.out.println(bean);
                return bean;
            }
        }
        return null;
    }


}
