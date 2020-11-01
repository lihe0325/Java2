package Person;

import Course.Course;
// 人员类
class Person {
    public int number;
    public String name;
    public String sex;

    public Person(int number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "编号：" + this.number + ", 姓名：" + this.name + ", 性别：" + this.sex;
    }
}

// 老师类继承自人员类
class Teachers extends Person {
    Course c;

    public Teachers(int number, String name, String sex) {
        super(number, name, sex);
    }

    public void setCourse(Course c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "编号：" + this.number + ", 姓名：" + this.name + ", 性别：" + this.sex  + ", 所授课程：" + c.getCourseName();
    }
}

// 学生类继承自人员类
public class Students extends Person {
    Course c;

    public Students(int number, String name, String sex) {
        super(number, name, sex);
    }

    public void setCourse(Course c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + ", 所学课程：" + c.getCourseName();
    }
}
