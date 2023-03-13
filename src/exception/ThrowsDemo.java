package exception;

public class ThrowsDemo {
    public static void main(String[] args)  {
        Student zs = new Student();
        try {
            zs.setAge(101);
            System.out.println("张三的年龄为"+zs.getAge()+"岁。");
        } catch (IllegalAgeException e) {
            /*System.out.println( e.getMessage());*/
            e.printStackTrace();
        }
        /*一般不在当前方法上使用throws声明该异常抛出给上层调用者main(),以及Java虚拟机*/

    }
}
