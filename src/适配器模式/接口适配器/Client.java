package 适配器模式.接口适配器;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/4 11:20
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        TestAbstract ts = new TestAbstract() {
                                //只需要复写需要使用的接口方法即可
                                public void m1() {
                                    System.out.println("重写m1方法");
                                    ;
                                }
                            };

        ts.m1();
    }
}
