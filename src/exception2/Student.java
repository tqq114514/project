package exception2;

public class Student {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0 || age>100){
            throw new RuntimeException();
        }
        this.age = age;
    }
}
