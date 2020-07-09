package 代理模式.静态代理;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 22:44
 * @Version: 1.0
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
