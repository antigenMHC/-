package 代理模式.静态代理;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 22:45
 * @Version: 1.0
 **/
public class TeacherProxy implements ITeacherDao {

    //聚合被代理对象
    private ITeacherDao teacher;

    public TeacherProxy(ITeacherDao teacher){
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("我开始代理上课！");
        teacher.teach();
        System.out.println("下课！");
    }
}
