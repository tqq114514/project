package exception2;

import exception.Student;

public class Throw {
    public static void main(String[] args) {
        Student zs =new Student();
        try {
            zs.setAge(101);
            System.out.println("年龄为"+zs.getAge());
        } catch (Exception e){
            System.out.println("年龄输入错误");

        }
    }
}
