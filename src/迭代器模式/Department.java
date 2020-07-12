package 迭代器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 18:50
 * @Version: 1.0
 **/
public class Department {

    private String name;
    private String des;

    public Department(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public Department(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
