package exception2;
/*自定义异常IllegalStudentAgeException，
对于调用者传入的学生年龄进行检查，
范围必需1<=age & age<=120,
数据不合法就抛出异常要求处理*/
public class FinalThrow {
    public static void main(String[] args) {
        StudentTest student = new StudentTest();
        try {
            student.setAge(121);
            System.out.println(student.getAge());
        } catch (Exception e) {
            System.out.println("学生的年龄不合法并且已经解决");
        }
    }
}
