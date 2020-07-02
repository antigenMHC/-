package 工厂模式.抽象工厂模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 9:52
 * @Version: 1.0
 **/
abstract public class Pizza {

    protected String name;

    void prepare() {
        System.out.println("准备"+name+"披萨的原材料");
    }

    void bake() {
        System.out.println(name+"披萨进行烘焙");
    }

    void cut() {
        System.out.println(name+"披萨进行切分");
    }

    void box() {
        System.out.println(name+"披萨进行装箱");
    }

    public void setName(String name){
        this.name = name;
    }
}
