package test;

public class test9 {
    public static void main(String[] args) {

    }
}
class Parent {
    public int count() {               // 第1行
        return 0;
    }
}
class Test1  extends Parent {
    private int i;
    public int count() {               // 第2行
        return i % 9;                     // 第3行
    }
}

