package test;

abstract class Animal  {
  public abstract  void saySomething();
}
  class Dog extends Animal {
  public void saySomething() {
              System.out.println("我现在有了第二职业：捉耗子！");
              }
  }
  class Test45 {
     public static void main (String[] args) {
                   Animal ani=new Dog();
                   ani.saySomething();
          }
  }
