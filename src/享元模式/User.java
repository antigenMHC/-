package 享元模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 14:28
 * @Version: 1.0
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
