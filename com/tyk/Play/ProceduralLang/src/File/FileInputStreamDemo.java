package File;

import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/vinskao/Desktop/test2/input.txt");
            FileInputStream fis = new FileInputStream(file);
            //这行代码用于创建一个 FileInputStream 对象，它是 Java 中用于从文件中读取字节数据的类。
            byte[] data = new byte[fis.available()];
            //如果您想读取整个文件的内容，通常最好的做法是获取文件的总大小，然后创建一个相应大小的字节数组。您可以使用 File 对象的 length() 方法来获取文件的总大小
            fis.read(data);
            String str = new String(data);
            System.out.println(str);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
