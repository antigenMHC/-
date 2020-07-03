package 原型模式.v2原型模式浅拷贝;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 13:24
 * @Version: 1.0
 **/
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String address;
    private Sheep friend;
    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep(String name, Integer age, String color, String address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }

    public Sheep(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 克隆该实例，通过重写默认的clone方法完成
     * @return
     *
     */
    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }catch (CloneNotSupportedException cse){
            System.out.println(cse.getMessage());
        }
        return sheep;
    }
}

