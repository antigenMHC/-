package 工厂模式.抽象工厂模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 9:52
 * @Version: 1.0
 **/
abstract public class PeiLiao {

    protected String name;

    void prepare() {
        System.out.println("准备"+name+"披萨的配料");
    }

    public void setName(String name) {
        this.name = name;
    }
}
