package Bean.dao;

import Bean.domain.ProductBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ProductDaoFile {
    private List<ProductBean> content;
    public List<ProductBean> getContent() {
        return this.content;
    }
    public void setContent(List<ProductBean> content) {
        this.content = content;
    }
    private List<ProductBean> loadfile(File input) {
        if (input == null) {
            return null;
        }
        List<ProductBean> result = new ArrayList<>();
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader("/Users/vinskao/Desktop/Java-Playground/com/tyk/Play/ProceduralLang/src/Bean/input.txt"));
        ) {
            line = in.readLine();
            while (line != null) { //讀取到流的末尾時，它會返回 null
                ProductBean bean = this.parseString(line); //引用其他class指向現class的方法
                result.add(bean);
                line = in.readLine(); //讀取下一行文字並存入 line
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    private ProductBean parseString(String line) throws ParseException {
        if (line != null) {
            String[] array = line.split(",");
            if (array != null && array.length == 5) {
                int id = Integer.parseInt(array[0]);
                Double price = Double.parseDouble(array[2]);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date make = sdf.parse(array[3]);
                int expire = Integer.parseInt(array[4]);
                // 調用bean的type
                ProductBean bean = new ProductBean();
                bean.setId(id);
                bean.setExpire(expire);
                bean.setMake(make);
                bean.setName(array[1]);
                bean.setPrice(price);


                return bean;

            }

        }

        return null;
    }
    public ProductDaoFile(File input){
        this.content = this.loadfile(input);
    }
}
