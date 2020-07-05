package 装饰者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:17
 * @Version: 1.0
 **/
abstract public class Drink {

    //描述
    public String dec;
    //价格
    private double price = 0.0;

    //计算费用, 由于配料和咖啡都要计算价格，所以抽离出来
    abstract public double cost();

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
