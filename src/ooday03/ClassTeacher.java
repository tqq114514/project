package ooday03;

public class ClassTeacher extends EmployFather {
    ClassTeacher(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.printf("名叫%s的班主任完成了他的工作。%n",name);
    }
}
