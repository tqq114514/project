package ooday05;

//getter,setter
/*1、框架的基本配置操作基于getter/setter方法
2、亦可以保证数据的合法性，做条件的控制
3、控制权限 getter(只读) setter(只写)
* */

public class Point {
    private  int x;
    private int y;
    public int getX(){
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }
}

