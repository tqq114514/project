package reflect;

import reflect.annotations.AutoRunClass;

/*使用当前类测试反射机制*/
@AutoRunClass
public class Person {
    private String name ="张三";
    private int age = 22;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println(name+":say hello!");
    }
    public void sayGoodbye(){
        System.out.println(name+":say goodbye!");
    }
    public void watchTV(){
        System.out.println(name+":watch tv!");
    }
    public void playGame(){
        System.out.println(name+":play game!");
    }
    public void say(String info){
        System.out.println(name+":"+info);
    }
    public void say(String info,int count){
        for (int i =0;i<count;i++){
            System.out.println(name+":"+info);
        }
    }
    private void haha(){
        System.out.println(name+"私有的方法，不准调用！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
