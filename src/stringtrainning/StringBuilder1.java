package stringtrainning;
/*
* 对字符串进行频繁操作，增加append：增加到末尾，删除delete指定部分，替换replace部分内容
* 插入insert
* */

public class StringBuilder1 {
    public static void main(String[] args) {
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

        //String和StringBuilder互转:
        String str1 = "hello";
        StringBuilder str11 = new StringBuilder(str1);
        String str12 = str11.toString();
        System.out.println(str12);
    }

}
