package ooday03;

public  abstract  class Animal1 {
    String name;
    int age;
    String color;

    Animal1(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void drink(){
        System.out.printf("%s颜色的%d岁的名叫%s的动物正在喝水。%n",color,age,name);
    }
    abstract  void eat();
    /*在大型项目中统一方法名，方便调用者调用,子类重写即可*/
}
