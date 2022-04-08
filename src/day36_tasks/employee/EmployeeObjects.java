package day36_tasks.employee;

public class EmployeeObjects {

    public static void main(String[] args) {


    Employee employee=new Employee();
    Developer developer=new Developer();
    Tester tester=new Tester();
    Teacher teacher=new Teacher();

    tester.setInfo("Layan", "QA", 'F',46,11, 110000 );
    developer.setInfo("Ali","Developer",'M',36,12,142000);
    teacher.setInfo("Alex","Instructor",'M',35,13,135000);

    developer.fixingBugs();
    employee.work();
    tester.work();
    teacher.work();
    teacher.teach();

        System.out.println(teacher);
        System.out.println(tester);

}   }
