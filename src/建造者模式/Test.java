package 建造者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 21:37
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {

        //创建建造者对象
        CourseBuilder courseBuilder = new CourseActualBuilder();

        //创建指挥者
        Coach coach = new Coach();

        //指挥者只会哪个建造者
        coach.setCourseBuilder(courseBuilder);

        //通过指挥者获得课程对象
        Course course = coach.makeCourse("Java", "JavaPPT",
                "JavaVedio", "Java笔记",
                "Java问答");

        System.out.println(course);
    }
}
