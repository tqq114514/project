package employee;

public abstract class EmployFather {
    String name;
    int age;
    double salary;
    EmployFather(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void clockIn(){
        System.out.printf("%s打卡上班了，又是美好的一天啊！%n",name);
    }
    void clockOut(){
        System.out.printf("%s打卡下班了，终于结束了！%n",name);
    }
    abstract void finishWork();
}
