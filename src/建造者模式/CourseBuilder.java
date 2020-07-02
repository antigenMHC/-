package 建造者模式;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_pt_BR;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 18:58
 * @Version: 1.0
 **/
abstract public class CourseBuilder {

    abstract public void buildCourseName(String courseName);
    abstract public void buildCoursePPT(String coursePPT);
    abstract public void buildCourseVeido(String courseVeido);
    abstract public void buildCourseArticle(String courseArticle);
    abstract public void buildCourseQA(String courseQA);

    abstract public Course makeCourse();

}
