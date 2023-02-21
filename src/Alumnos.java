import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Alumnos {

    public static void main(String[] args) {

        String alumno = "Jose flores";
        String alumno2 = "Raul Perez";
        String alumno3 = "Jose Luis";
        String alumno4 = "Juan Perez";
        String alumno5 = "luis Ramirez";
        String alumno6 = "Carlos Perez";
        String alumno7 = "Jose Perez";
        String alumno8 = "Jose Perez";
        String alumno9 = "Jose Perez";
        String alumno10 = "Jose Perez";

        Collection<String> alumnos = new HashSet<String>();
        //Collection<String> alumnos = new ArrayDeque<>();
        //Set<String> alumnos = new HashSet<String>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
        alumnos.add(alumno9);
        alumnos.add(alumno10);

        boolean encontrado = alumnos.contains("Carlos Pereza");
        String max = alumnos.stream().max(Comparator.comparingInt(String::length)).get();
        String min = alumnos.stream().min(Comparator.comparingInt(String::length)).get();
        alumnos.removeIf(n -> n.equals("Jose Perez"));
        System.out.println(encontrado);
        System.out.println();
        System.out.println(max);
        System.out.println();
        System.out.println(min.length());
        System.out.println();
        alumnos.forEach(System.out::println);

    }
    
}
