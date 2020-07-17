package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 9:19
 * @Version: 1.0
 **/

/**
 * 请求类
 */
public class PurchaseRequest {
    //请求类型
    private int type;
    //请求金额
    private double price;
    //id
    private int id;

    public PurchaseRequest(int type, double price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
