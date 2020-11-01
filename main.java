package main;

import Course.Course;
import Person.Students;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 以数组的方式实例化课程类
        Course[] c = new Course[3];
		c[0] =  new Course(0,"高等数学","教102","9月25日","刘老师");
		c[1] =  new Course(1,"离散数学","教304","9月28日","魏老师");
		c[2] =  new Course(2,"Java技术及应用","教306","9月30日","张老师");
        System.out.println("--------------------欢迎来到选课系统--------------------");
        for (int i = 0; i < c.length; i++) {
            System.out.println();
            System.out.println(c[i]);
        }

        System.out.println("------------------------------------------------------------------------");
        Students stu = new Students(2020322061, " 李赫", "男");
        int num = 0;
        String exit = "ok";
        while (exit.equals("ok")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入编号来选课程：");
            num = scanner.nextInt();
            stu.setCourse(c[num]);
            System.out.println("您的基本信息：" + stu);
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("请输入‘q’来退出选课系统: ");
            exit = scanner1.nextLine();
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("剩余课程如下：");
        for (int i = 0; i < c.length; i++) {
            if (i == num) {
                continue;
            }
            System.out.println();
            System.out.println(c[i]);
        }
    }
}
