package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        /*stringBuilder的创建方式*//*
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("哈哈");

        *//*String和StringBuilder互相转换*//*
        String str = "bb";
        StringBuilder sb2 = new StringBuilder(str);
        String str1 = sb2.toString();*/
        String str = new String("好好学习Java");
        StringBuilder builder = new StringBuilder(str);
        builder.append("，为了找个好工作");  //在末尾追加
        System.out.println(builder);
        builder.replace(9,16,"就是为了改变世界");  //含头不含尾
        System.out.println(builder);
        //删除部分内容
        builder.delete(0,9);  //含头不含尾
        System.out.println(builder);
        //插入内容
        builder.insert(0,"活着，");
        System.out.println(builder);


    }
}
