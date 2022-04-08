package day33_tasks;

public class TestStudents {

    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("Zeynep","EU08",42,1566,4,'F','A');
        System.out.println(student1);

        student1.study();

        student1.attendClass();

        CydeoStudent.printSchoolName();

        CydeoStudent.printProgLanguage();

    }

}
