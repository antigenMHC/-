package 原型模式.v2原型模式浅拷贝;


/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 13:32
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Sheep sheep = new Sheep("肖恩", 100, "尼哥色", "蒙古");
        sheep.setFriend(new Sheep());
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        //......
        sheep.getFriend().setAge(19);
        System.out.println(sheep.getFriend() == sheep2.getFriend());
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
