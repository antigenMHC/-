package 原型模式.v3原型模式深拷贝之序列化;

import java.io.*;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/3 16:51
 * @Version: 1.0
 **/
public class DeepPrototype implements Serializable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepPrototype(){}

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

    //通过序列化实现 clone
    public Object deepClone(){

        //需要返回的反序列化出来的对象
        Object deepCopy = null;

        //创建流对象
        FileOutputStream bos = null;
        ObjectOutputStream oos = null;

        FileInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //序列化操作
            bos = new FileOutputStream("test");
            //指定接下来输出的对象输出到哪个流中
            oos = new ObjectOutputStream(bos);
            //把当前对象以对象流的方式输出到bos中
            oos.writeObject(this);

            //反序列化
            //获得bos字节数组内容
            bis = new FileInputStream("test");
            //将字节输入流内容转到对象输入流
            ois = new ObjectInputStream(bis);
            //读取出流中对象
            deepCopy = ois.readObject();

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                assert bos != null;
                bos.close();
                assert oos != null;
                oos.close();
                assert bis != null;
                bis.close();
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return deepCopy;
    }
}
