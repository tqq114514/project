package test;

public class InnerClass {
    public static void main(String[] args) {
        /*In1 in  = new In1();*/   //内部类，只让外部类使用，不具备可见性
        Out1 out = new Out1();
    }
}
class Out1{   //外部类
    String name;
    int age ;
    void run(){
        In1 in  = new In1();  //内部类只在外部类中实例化
    }
    class In1{
        //内部类，只让外部类使用，不具备可见性
        //外部类名.this:指代当前对象的外部类对象
        void show(){
            System.out.println(Out1.this.name);
        }
    }
}

