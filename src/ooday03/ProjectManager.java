package ooday03;

public class ProjectManager extends EmployFather implements TechnicalWriter {
    ProjectManager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.printf("名叫%s的项目经理完成了他的工作。%n",name);
    }

    @Override
    public void editBooks() {
        System.out.printf("名叫%s的项目经理完成了他的书籍。%n",name);
    }
}
