package ooday02;

public class Doctor extends Person{
     String title;   //职称
     void cut(){
          System.out.println(name+"正在做手术。");
     }
     /*Doctor(){
          super();
     }*/
     /*构造方法中默认第一句调用超类无参构造方法*/
     Doctor(String name,int age,String address,String title){
          super(name,age,address);
          this.title = title;
     }
     void sayHi(){
          System.out.println("大家好，我的名字叫"+name+",我今年"+age+
                  "岁了，我住在"+address+","+"我的职称是"+title+"。");
     }


}
