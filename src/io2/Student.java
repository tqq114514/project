package io2;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private String name;
    private int age;
    private String gender;
    private transient String[] otherInfo;
    /*当一个属性被关键字transient修饰后，当这个对象被序列化时，此属性值会被忽略
     * 忽略不必要的属性值可以达到对象序列化瘦身的目的
     * 可以减少磁盘开销或提高网络传输效率*/

    public Student() {
    }

    public Student(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

}
