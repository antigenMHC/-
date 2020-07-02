package 建造者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 19:18
 * @Version: 1.0
 **/
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    /**
     * 根据客户端传递的参数来构建一个课程对象
     * @param courseName
     * @param coursePPT
     * @param courseVedio
     * @param courseArticle
     * @param courseQA
     * @return:返回建造好的课程对象
     */
    public Course makeCourse(String courseName, String coursePPT,
                             String courseVedio, String courseArticle,
                             String courseQA){

        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVeido(courseVedio);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
