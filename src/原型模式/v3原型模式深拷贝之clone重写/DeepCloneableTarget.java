package 原型模式.v3原型模式深拷贝之clone重写;

import java.io.Serializable;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 16:49
 * @Version: 1.0
 **/
public class DeepCloneableTarget implements Cloneable {

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }
}
