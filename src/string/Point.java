package string;
/*标准JavaBean要求：
1、所有成员变量都是私有的
2、需要提供getter/setter
3、必须提供无参的构造方法
* */
public class Point {
    private  int x;
    private  int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
