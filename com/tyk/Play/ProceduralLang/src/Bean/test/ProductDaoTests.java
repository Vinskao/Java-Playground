package Bean.test;

import Bean.dao.ProductDaoFile;
import Bean.domain.ProductBean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class ProductDaoTests {
    public static void main(String[] args) {
        File input = new File("/Users/vinskao/Desktop/Java-Playground/com/tyk/Play/ProceduralLang/src/Bean/input.txt");
        ProductDaoFile dao = new ProductDaoFile(input);
        List<ProductBean> productList = dao.getContent();
//        System.out.println(productList);
    }
}
