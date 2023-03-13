package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo2 {
    public void test() throws IOException , AWTException{}
}
class a extends ThrowsDemo2{
    /*public void test() throws IOException , AWTException{}*/  //可以完全相同
    /*public void test(){}*/  //什么也不输出也可以
    /*public void test() throws IOException{}*/ //可以只抛出部分异常
    /*public void test() throws FileNotFoundException {}*/    //可以抛出超类异常的子类型

    /*不能抛父类不存在的异常，不允许抛出超类异常的父类*/
    /*public void test() throws IllegalAgeException{}*/
    /*public void test() throws Exception{}*/

}
