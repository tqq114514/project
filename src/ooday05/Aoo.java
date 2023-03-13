package ooday05;
/*访问控制修饰符演示以及封装*/
public class Aoo {
    public int a;
    protected int b;
    int c;
    private int d;
    void show(){
        a = 1;
        b = 1;
        c = 1;
        d = 1;
    }

    public Aoo(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Aoo() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

class Boo{
    void show(){
        Aoo o = new Aoo();
        o.a = 1;
        o.b = 2;
        o.c = 3;
        /*o.d = 4;*/    //private不同类中不允许访问
    }
}
