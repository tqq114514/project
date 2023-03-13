package ooday03;

public class DirectorOfTeachingAndResearch extends EmployFather implements BusinessDoctor {
    DirectorOfTeachingAndResearch(String name,int age,double salary){
        super(name, age, salary);
    }
    @Override
    void finishWork() {
        System.out.printf("名叫%s的总监完成了他的工作。%n",name);
    }


    @Override
    public void editBooks() {
        System.out.printf("名叫%s的总监完成了他的书籍。%n",name);
    }

    @Override
    public void trainEmployees() {
        System.out.printf("名叫%s的总监正在培训员工。%n",name);
    }

    @Override
    public void solveEnterpriseProblems() {
        System.out.printf("名叫%s的总监正在协助解决公司难题。%n",name);
    }
}
