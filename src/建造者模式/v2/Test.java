package 建造者模式.v2;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 21:58
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {

        //链式调用
        Course course = new Course.CourseBuilder().
                buildCourseName("Java").buildCourseVeido("Java视频")
                .buildCourseArticle("Java笔记").buildCoursePPT("JavaPPT")
                .buildCourseQA("Java问答").build();

        System.out.println(course);
    }
}
