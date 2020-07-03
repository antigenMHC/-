package 原型模式.v3原型模式深拷贝之序列化;



/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 16:48
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepPrototype dp = new DeepPrototype();
        dp.setName("燕双鹰");
        dp.setDeepCloneableTarget(new DeepCloneableTarget("燕双鹰的自行车", "燕双鹰的枪"));

        //完成深拷贝
        DeepPrototype cloneDp = (DeepPrototype) dp.deepClone();
        System.out.println(dp.getName()+"  "+cloneDp.getName());
        //比较引用类型是否是同一个
        System.out.println(cloneDp.getDeepCloneableTarget() == dp.getDeepCloneableTarget());
    }
}
