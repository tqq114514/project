package test;

interface MyInterFace{
    int counter = 20;
}
public class MyClass implements MyInterFace{
    private static int counter;
    public static void main(String[]args){
        System.out.println(++counter);
    }
}

