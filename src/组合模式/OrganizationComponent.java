package 组合模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/6 12:42
 * @Version: 1.0
 **/
abstract public class OrganizationComponent {

    //名字
    private String name;
    //描述
    private String des;

    /**
     * 默认实现，对于叶子结点而言，没有可以操作的子结点，
     * 所以它是不用重写 add 方法的
     * */
    protected void add(OrganizationComponent component){

    }

    protected void remove(OrganizationComponent component){

    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

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

    //所有子类都需要实现
    abstract public void printf();
}
