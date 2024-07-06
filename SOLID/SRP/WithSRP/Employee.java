package JavaProgramming.SOLID.SRP;

public class Employee {
    public String firstName;
    public String lastName;
    public String empId;
    public double experienceInYears;
    public Employee(String firstName, String lastName, double experienceInYears){
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }

    public void displayEmpDetail(){
        System.out.println("The employee name:"+lastName+","+firstName);
        System.out.println("This employee has "+experienceInYears+" years of experience.");
    }
}
