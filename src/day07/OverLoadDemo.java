package day07;


public class OverLoadDemo {
    public static void main(String[] args) {
        show();
        show(33);
        show("hduhdai");
        show(23,"ye38q");
        show("udhu",223);
/*        show(23.54);*/
    }
    public static void show(){
    }    //方法的重载
    public static void show(String s){
    }
    public static void show(int m){
    }
    public static void show(String s,int m){
    }
    public static void show(int m,String s){
    }
    /*public static int show(int m,String s){
        return 0;
    }*/  //编译错误，重载与返回值类型无关
    /*private static  void show(int m,String s){
    }*/
    /*与参数的名字无关*/
    /*public  static void  show(int m,String sui){
    }*/

}
