package 适配器模式.对象适配器;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/4 9:22
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Phone phone = new Phone();
        //我们只需要调用适配器，而无需关系内部是如何给我们进行充电的
        phone.chongDian(new VoltageAdapter(new Voltage220V()));
    }
}
