package Course;

public class Course {
    public int number;
    public String courseName;
    public String site;
    public String time;
    public String teacher;

    public Course(int number, String courseName, String site, String time, String teacher) {
        this.number = number;
        this.courseName = courseName;
        this.site = site;
        this.time = time;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return this.courseName;
    }


    @Override
    public String toString() {
        return "[" + "编号：" + this.number + ", 课程名称：" + this.courseName + ", 上课地点："
                + this.site + ", 时间：" + this.time + ", 授课教师：" + this.teacher + "]";
    }
}
