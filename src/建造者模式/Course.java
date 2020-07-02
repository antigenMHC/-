package 建造者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 18:54
 * @Version: 1.0
 **/
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVedio;
    private String courseArticle;
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseNase) {
        this.courseName = courseNase;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVedio() {
        return courseVedio;
    }

    public void setCourseVedio(String courseVedio) {
        this.courseVedio = courseVedio;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNase='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVedio='" + courseVedio + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
