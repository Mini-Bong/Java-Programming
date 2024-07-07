package JavaProgramming.SOLID.OpenClose.withOpenClose;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> sciencStudents = enrollScienceStudents();
        List<Student> artStudents = enrollArtsStudents();
        System.out.println("===Results:===");
        for (Student student : sciencStudents) {
            System.out.println(student);
        }
        for (Student student : artStudents) {
            System.out.println(student);
        }

        // Evaluate distinction
        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        DistinctionDecider artsDistinctionDecider = new ArtsDistinctionDecider();
        System.out.println("===Distinctions:===");

        for(Student student : sciencStudents){
            scienceDistinctionDecider.evaluateDistinction(student);
        }

        for(Student student : artStudents){
            artsDistinctionDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam","R1",81.5,"Comp.Sc.");
        Student bob = new ScienceStudent("Bob","R2",72,"Physics");
        List<Student> scienceStudents = new ArrayList<Student>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
        }
    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", 71,"History");
        Student kate = new ArtsStudent("Kate", "R4", 66.5,"English");
        List<Student> artsStudents = new ArrayList<Student>();
        artsStudents.add(john);
        artsStudents.add(kate);
        return artsStudents;
    }
}
