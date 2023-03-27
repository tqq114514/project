package test;

public class A {
    public String printStr(){
        System.out.println("A");
        return "a";
    }
    public String printStr(String input){
        System.out.println(input);
        return input;
    }
}
class B extends A{
    public String printStr(String input){
        return input;
    }
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.printStr());
        System.out.println(a.printStr("B"));
    }
}
