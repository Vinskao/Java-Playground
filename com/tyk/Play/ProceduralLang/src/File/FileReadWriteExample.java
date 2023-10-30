package File;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/vinskao/Desktop/test2/input.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("/Users/vinskao/Desktop/test2/output.txt"));
            String str; //用于存储每次从输入文件读取的文本行。

            while ((str = in.readLine()) != null) { // 修改这行，添加括号以正确赋值并检查是否为 null
                out.write(str);
                out.newLine();
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
