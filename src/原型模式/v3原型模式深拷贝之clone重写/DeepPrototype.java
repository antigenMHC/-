package 原型模式.v3原型模式深拷贝之clone重写;

import java.io.Serializable;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 16:51
 * @Version: 1.0
 **/
public class DeepPrototype implements Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepPrototype(){}

    //使用 clone 方法实现深拷贝

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //这里完成对基本数据类型的复制
        Object deep = super.clone();

        //对引用类型的属性进行单独处理；
        //引用类型把自己克隆下来后交给具体原型类中对象的属性
        DeepPrototype deepPrototype = (DeepPrototype)deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepPrototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }
}
