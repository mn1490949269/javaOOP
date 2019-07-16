package model;

public class Student {
    public String name; // 成员变量
    private int age; // 成员变量
    public String sex; // 成员变量
    private String stuNo; // 成员变量

    // 构造方法
    public Student(String name, int age,String sex, String stuNo) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuNo = stuNo;
    }

    // 成员方法
    public int getAge() {
        return age;
    }
    // 成员方法
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    // 成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    // 成员方法
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStuNo() {
        return stuNo;
    }
    // 成员方法
    public void setStuNo() {
        this.stuNo = stuNo;
    }
}
