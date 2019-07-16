package model;

public class Print {
    public static void main(String[] args) {
        Student stu = new Student("lisi",20,"男","20190101");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getSex());
        System.out.println(stu.getStuNo());
    }

}

