package co.edu.uptc.logic;

import java.time.LocalDate;
import java.util.Date;
import co.edu.uptc.models.*;

public class Main {
    // Cada Management por cada clase
    private static Management<Student> studentM = new Management<>();
    private static Management<Teacher> teacherM = new Management<>();
    private static Management<University> uniM = new Management<>();
    private static Management<Campus> campusM = new Management<>();
    private static Management<Rector> rectorM = new Management<>();

    public static void main(String[] args) {
        
        // TEACHER 
        Teacher t = new Teacher("Camilo", "1", "Quintero", "Temporal", true);
        teacherM.insertObject(t); 
        System.out.println("Teacher: " + teacherM.findObjectById("1"));

        // UNIVERSITY
        University u = new University("UPTC", "U01", "Cra 6 # 41-60", "uptc.edu.co", LocalDate.of(1953, 10, 10), true);
        uniM.insertObject(u);
        System.out.println("Uni: " + uniM.findObjectById("U1"));

        // STUDENT 
        Student s = new Student("Carlos", "S1", "Rosendo", 3, 17);
        studentM.insertObject(s);
        System.out.println("Student: " + studentM.findObjectById("S204"));

        // RECTOR 
        Rector r = new Rector("R99", "Engineer", true, "Alonso", LocalDate.now());
        rectorM.insertObject(r);
        System.out.println("Rector: " + rectorM.findObjectById("R1"));

        // CAMPUS
        Campus c = new Campus("San Ricardo", "C55", 520, 50.70, "Duitama");
        campusM.insertObject(c); 
        System.out.println("Campus: " + campusM.findObjectById("C10"));
    }
}
