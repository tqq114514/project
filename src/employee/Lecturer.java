package employee;

public class Lecturer extends EmployFather implements BusinessDoctor{
    Lecturer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.printf("名叫%s的讲师完成了他的工作。%n",name);
    }

    @Override
    public void trainEmployees() {
        System.out.printf("名叫%s的讲师正在培训员工。%n",name);
    }

    @Override
    public void solveEnterpriseProblems() {
        System.out.printf("名叫%s的讲师正在协助解决公司难题。%n",name);
    }

    @Override
    public void editBooks() {
        System.out.printf("名叫%s的讲师完成了他的书籍。%n",name);
    }
}
