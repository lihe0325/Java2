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
        return "[" + "��ţ�" + this.number + ", �γ����ƣ�" + this.courseName + ", �Ͽεص㣺"
                + this.site + ", ʱ�䣺" + this.time + ", �ڿν�ʦ��" + this.teacher + "]";
    }
}
