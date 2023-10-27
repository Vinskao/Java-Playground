package Bean.domain;
import java.util.*;

public class ProductBean {
    private Integer id;
    private String name;
    private double price;
    private java.util.Date make;
    private Integer expire;

    @Override
    public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", make=" + make +
                ", expire=" + expire +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getMake() {
        return make;
    }

    public void setMake(Date make) {
        this.make = make;
    }

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }
}
