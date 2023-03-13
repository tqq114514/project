package exception2;


public class StudentTest {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalStudentAgeException {
        if (age<=0 || age>120) {
            throw new IllegalStudentAgeException();
        }
        this.age = age;
    }
}
