package employee;

public class EmployTest {
    public static void main(String[] args) {
        DirectorOfTeachingAndResearch directorOfTeachingAndResearch = new DirectorOfTeachingAndResearch("张三",30,23000.88);
        directorOfTeachingAndResearch.clockIn();
        directorOfTeachingAndResearch.clockOut();
        directorOfTeachingAndResearch.finishWork();
        directorOfTeachingAndResearch.editBooks();
        directorOfTeachingAndResearch.solveEnterpriseProblems();
        directorOfTeachingAndResearch.trainEmployees();
        Lecturer lecturer = new Lecturer("张三",38,19800.88);
        lecturer.trainEmployees();
        lecturer.editBooks();
        lecturer.finishWork();
        lecturer.solveEnterpriseProblems();
        lecturer.clockIn();
        lecturer.clockOut();
        ProjectManager projectManager = new ProjectManager("王五",29,13500.55);
        projectManager.editBooks();
        projectManager.finishWork();
        projectManager.clockIn();
        projectManager.clockOut();
        ClassTeacher classTeacher = new ClassTeacher("赵六",35,10588.36);
        classTeacher.clockIn();
        classTeacher.clockOut();
        classTeacher.finishWork();
    }

}
