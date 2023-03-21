package test;

public class d1 {
    public  int add(int a,int b){
        try{
            return a+b;
        }catch(Exception e){
            System.out.println("catch 语句块");
        }finally{
            System.out.println("finally 语句块");
        }
        return 0;
    }
    public static void main(String[] args){
        d1 demo = new d1();
        System.out.println("和是："+demo.add(9,34));
    }
}
