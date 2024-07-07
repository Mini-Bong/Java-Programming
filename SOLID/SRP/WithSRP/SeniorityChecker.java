package JavaProgramming.SOLID.SRP.WithSRP;

public class SeniorityChecker {
    public String checkSeniority(double experienceInYears){
        return experienceInYears > 5 ? "Senior" : "Junior";
    }
}
