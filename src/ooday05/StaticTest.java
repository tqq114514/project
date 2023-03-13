package ooday05;

public class StaticTest {
    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable();
        sv.show();
        StaticVariable sv1 = new StaticVariable();
        sv1.show();
        StaticVariable sv2 = new StaticVariable();
        sv2.show();
        System.out.println(StaticVariable.b);
    }

}
