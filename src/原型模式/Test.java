package 原型模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 12:43
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {


        Sheep sheep = new Sheep("肖恩", 100, "尼哥色");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        //......

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        //......
    }
}
