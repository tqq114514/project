package ooday05;

public class Student {
    private String name;
    private int age;
    static String classname;   //所有班级学员共享的属性

    static {
        classname = "JSDT2302";
        /*其他图片、视频等静态资源*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
