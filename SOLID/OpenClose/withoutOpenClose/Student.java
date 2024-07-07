package JavaProgramming.SOLID.OpenClose.withoutOpenClose;

public class Student {
    
    String name;
    String regNumber;
    String department;
    double score;
    public Student(String name, String regNumber, double score, String department){
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
        this.department = department;
    }

    @Override
    public String toString(){
        return ("Name: " + name +"\nReg Number: " + regNumber +
                  "\nDept:" + department +
                  "\nMarks:" + score +
                  "\n*******");
    }
}
