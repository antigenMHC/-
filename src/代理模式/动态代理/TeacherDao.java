package 代理模式.动态代理;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/9 10:00
 * @Version: 1.0
 **/
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师正在授课");
    }
}
