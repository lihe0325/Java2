package main;

import Course.Course;
import Person.Students;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // ������ķ�ʽʵ�����γ���
        Course[] c = new Course[3];
		c[0] =  new Course(0,"�ߵ���ѧ","��102","9��25��","����ʦ");
		c[1] =  new Course(1,"��ɢ��ѧ","��304","9��28��","κ��ʦ");
		c[2] =  new Course(2,"Java������Ӧ��","��306","9��30��","����ʦ");
        System.out.println("--------------------��ӭ����ѡ��ϵͳ--------------------");
        for (int i = 0; i < c.length; i++) {
            System.out.println();
            System.out.println(c[i]);
        }

        System.out.println("------------------------------------------------------------------------");
        Students stu = new Students(2020322061, " ���", "��");
        int num = 0;
        String exit = "ok";
        while (exit.equals("ok")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("����������ѡ�γ̣�");
            num = scanner.nextInt();
            stu.setCourse(c[num]);
            System.out.println("���Ļ�����Ϣ��" + stu);
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("�����롮q�����˳�ѡ��ϵͳ: ");
            exit = scanner1.nextLine();
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("ʣ��γ����£�");
        for (int i = 0; i < c.length; i++) {
            if (i == num) {
                continue;
            }
            System.out.println();
            System.out.println(c[i]);
        }
    }
}
