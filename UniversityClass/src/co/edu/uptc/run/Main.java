package co.edu.uptc.run;

import java.time.LocalDate;
import java.util.Scanner;
import co.edu.uptc.models.*;
import co.edu.uptc.logic.Management;

public class Main {
    // Cada Management por cada clase
    private static Management<Student> studentM = new Management<>();
    private static Management<Teacher> teacherM = new Management<>();
    private static Management<University> uniM = new Management<>();
    private static Management<Campus> campusM = new Management<>();
    private static Management<Rector> rectorM = new Management<>();

   private static Scanner sc = new Scanner(System.in);
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
        
            int opcion;
            do {
                System.out.println("\n--- SISTEMA UNIVERSITARIO CRUD ---");
                System.out.println("[1]. Consultar todos los registros (B)");
                System.out.println("[2]. Actualizar registros (C)");
                System.out.println("[3]. Eliminar registros (D)");
                System.out.println("[4]. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1: consultarTodo(); break;
                    case 2: actualizarTodo(); break;
                    case 3: eliminarTodo(); break;
                    case 4: System.out.println("Saliendo..."); break;
                    default: System.out.println("Opción no válida.");
                }
            } while (opcion != 4);
        }

        // -- consulta registros
        public static void consultarTodo() {
            System.out.println("\n--- RESULTADOS DE CONSULTA ---");
            
            studentM.getList().forEach(s -> System.out.println("Estudiante ID: " + s.getId()));
            teacherM.getList().forEach(t -> System.out.println("Profesor ID: " + t.getId()));
            uniM.getList().forEach(u -> System.out.println("Universidad NIT: " + u.getId()));
            campusM.getList().forEach(c -> System.out.println("Campus ID: " + c.getId()));
            rectorM.getList().forEach(r -> System.out.println("Rector ID: " + r.getId()));
        }

        // --actualizacion de registros
        public static void actualizarTodo() {
            System.out.print("Ingrese ID para actualizar: ");
            String id = sc.nextLine();

            // Busqueda Sutudents
            Student s = studentM.findObjectById(id);
            if (s != null) {
                System.out.print("Nuevo semestre: ");
                s.setCurrentSemester(sc.nextInt());
                System.out.println("Estudiante actualizado.");
                return;
            }

            // Busqueda teachers
            Teacher t = teacherM.findObjectById(id);
            if (t != null) {
                System.out.print("Nuevo tipo de contrato: ");
                t.setContractType(sc.nextLine());
                System.out.println("Profesor actualizado.");
                return;
            }

            // Busqueda Campus
            Campus c = campusM.findObjectById(id);
            if (c != null) {
                System.out.print("Nueva capacidad: ");
                c.setCapacity(sc.nextInt());
                System.out.println("Campus actualizado.");
                return;
            }

            System.out.println("ID no encontrado en ninguna entidad (Estudiante, Profesor o Campus).");
        }

        // Eliminacion registros
        public static void eliminarTodo() {
            System.out.print("Ingrese ID para eliminar: ");
            String id = sc.nextLine();

            if (studentM.deleteObject(id)) {
                System.out.println("Estudiante eliminado.");
            } else if (teacherM.deleteObject(id)) {
                System.out.println("Profesor eliminado.");
            } else if (campusM.deleteObject(id)) {
                System.out.println("Campus eliminado.");
            } else if (uniM.deleteObject(id)) {
                System.out.println("Universidad eliminada.");
            } else if (rectorM.deleteObject(id)) {
                System.out.println("Rector eliminado.");
            } else {
                System.out.println("No se encontró el registro con ese ID.");
            }
        }
    }
