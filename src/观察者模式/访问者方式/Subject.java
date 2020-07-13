package 观察者模式.访问者方式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 10:33
 * @Version: 1.0
 **/
public interface Subject {

    void registerObsever(Obsever obsever);
    void removeObsever(Obsever obsever);
    void notifyObsever();
}
