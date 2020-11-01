package Person;

import Course.Course;
// ��Ա��
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
        return "��ţ�" + this.number + ", ������" + this.name + ", �Ա�" + this.sex;
    }
}

// ��ʦ��̳�����Ա��
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
        return "��ţ�" + this.number + ", ������" + this.name + ", �Ա�" + this.sex  + ", ���ڿγ̣�" + c.getCourseName();
    }
}

// ѧ����̳�����Ա��
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
        return super.toString() + ", ��ѧ�γ̣�" + c.getCourseName();
    }
}
