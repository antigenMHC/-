package 建造者模式.v2;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 21:46
 * @Version: 1.0
 **/
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVedio;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseVedio = courseBuilder.courseVedio;
        this.courseQA = courseBuilder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVedio='" + courseVedio + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public  static class CourseBuilder{

        private String courseName;
        private String coursePPT;
        private String courseVedio;
        private String courseArticle;
        private String courseQA;


        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVeido(String courseVeido) {
            this.courseVedio = courseVeido;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }
}
