package JavaProgramming.SOLID.SRP;

import java.util.Random;

class Employee {
    public String firstName, lastName, empId;
    public double experienceInYears;
    public Employee(String firstName, String lastName, double experienceInYears){
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }

    public void displayEmpDetails(){
        System.out.println("The employee name: " +lastName+","+firstName);
        System.out.println("This employee has " +experienceInYears +"years of experience.");
    }

    public String checkSeniority(double experienceInYears){
        return experienceInYears > 5 ? "senior" : "junior";
    }

    public String generateEmpId(String firstName){
        int random = new Random().nextInt(1000);
        empId = firstName.substring(0,1) + random;
        return empId;
    }
}

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without SRP.***");
        Employee robin = new Employee("Robin", "Smith", 7.5);
        showEmpDetail(robin);
        System.out.println("\n*******\n");
        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetail(kevin);
     }
 
 
   private static void showEmpDetail(Employee emp) {
         emp.displayEmpDetails();
         System.out.println("The employee id: "+
                   emp.generateEmpId(emp.firstName));
         System.out.println("This employee is a " +
                   emp.checkSeniority(emp.experienceInYears)+
                     " employee.");
     }
}
