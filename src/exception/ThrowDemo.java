package exception;


public class ThrowDemo {
    public static void main(String[] args) {
        Student zs = new Student();
        try {
            zs.setAge(0);
            System.out.println("此人的年龄为"+zs.getAge()+"岁");
        } catch ( IllegalAgeException e) {
            System.out.println("发现年龄数据不合理并进行处理");
        }
    }
}
