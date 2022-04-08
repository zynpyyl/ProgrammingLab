package day36_tasks.employee;

public class Employee {
    public String name,jibTitle;
    public char gender;
    public int age,id;
    public double salary;

    public void setInfo(String name, String jibTitle, char gender, int age, int id, double salary) {
        this.name = name;
        this.jibTitle = jibTitle;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name + " is working ");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jibTitle='" + jibTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}






/*
2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()
 */