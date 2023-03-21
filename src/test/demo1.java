package test;

class demo1 {
    int x;
    public static void main(String[] args) 	{
        demo1 demo1 = new demo1();
        demo1.x = 8;
        show(demo1);
        System.out.println("x="+demo1.x);
    }
    public static void show(demo1 d)	{
        d.x = 7;
    }
}
