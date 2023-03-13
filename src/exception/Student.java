package exception;

import java.io.FileNotFoundException;

/*测试异常的抛出*/
public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        /*要在赋值之前抛异常(捕捉异常)*/
        if(age<=0 ||age>100) {
            throw new IllegalAgeException("年龄写错了");
        }
        this.age = age;
    }
}
