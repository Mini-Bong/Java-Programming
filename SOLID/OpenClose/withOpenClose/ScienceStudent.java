package JavaProgramming.SOLID.OpenClose.withOpenClose;

public class ScienceStudent extends Student{
    public ScienceStudent(String name, String regNumber, double score, String department){
        super(name, regNumber, score);
        this.department = department;
    }
}
