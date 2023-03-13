package string;

public class StringAndStringBuilderDemo {
    public static void main(String[] args) {
        /*当需要频繁更改字符串时，需要用到StringBuilder,内部维护了一个可变char数组,修改快速
        * 提供了增、删、改、插方法*/
        /*看用String,*/
        /*常用方法
        * append();追加内容---在末尾追加
        * delete():删除部分内容
        * replace():替换部分内容，含头不含尾
        * insert():插入内容*/
        String s = "a";
        StringBuilder builder = new StringBuilder(s);
        for (int i =0;i<10000000;i++){
            builder.append(i);
        }
        System.out.println("执行完毕");
    }
}
