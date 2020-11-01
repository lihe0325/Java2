# 2020322061 李赫
## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例： 人员（编号、姓名、性别）
教师（编号、姓名、性别、所授课程）
   学生（编号、姓名、性别、所选课程）
   课程（编号、课程名称、上课地点、时间、授课教师）
## 实验过程
1.Course包：定义编号 (number),课程名称(coursrName),上课地点(site),时间(time),授课教师(teacher)。
2.main包:以数组的方式实例化课程类，模拟学生退课操作，打印课程信息。
3.Student包:老师类继承人员类,学生类继承人员类。
## 核心代码
以数组的方式实例化课程类
```
      Course[] c = new Course[3];
		c[0] =  new Course(0,"高等数学","教102","9月25日","刘老师");
		c[1] =  new Course(1,"离散数学","教304","9月28日","魏老师");
		c[2] =  new Course(2,"Java技术及应用","教306","9月30日","张老师");
```
老师类继承人员类
```
class Teachers extends Person {
    Course c;

    public Teachers(int number, String name, String sex) {
        super(number, name, sex);
    }
```
## 实验结果
运行结果
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/ruAMsa53pVQWN7FLK88i5u61v.GOkVXMlu*TMqH7oxyD1WWO3yg5ac1YznLTelb0Ml.ZH1ClB7qtXSze3nX5c9Ed2hZOnkxaSIWCYETfM34!/b&bo=*QKeAAAAAAADB0M!&rf=viewer_4)  
选课、退课运行结果
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcRTf8bX1KhhlfBCbdHH26jUHXMdrTJUuNTw3h9e8bzCqnKjAF5tnhc.hkPJJBPLbqlYOwjLm5dZM9W4uawjWzwU!/b&bo=BAPQAAAAAAADF.U!&rf=viewer_4) 
## 编程感想
1.掌握了面向对象的类设计方法
2.掌握了继承的用法，通过构造方法实例化对象。
3.通过查阅资料，初步了解数组的使用。





