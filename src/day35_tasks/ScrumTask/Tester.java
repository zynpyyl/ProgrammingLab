package day35_tasks.ScrumTask;

public class Tester {
    private String name,jobTitle;
    private int employeeID;
    private double salary;

    public Tester(String name, String jobTitle, int employeeID, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0)
            return;
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0)
            return;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void createTicket(){
        System.out.println(name+" is creating ticket");
    }
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

}



/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */
/*
4. ScrumTeam Task:
        re-do the Scrum task by making all the fields private in each custom classes
        Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

        Avoid any duplicated code fragments in each class
 */