import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Collections;
//import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cursos> list = new ArrayList<>();
        Cursos curso1 = new Cursos("Java", 30);
        Cursos curso2 = new Cursos("PHP", 20);
        Cursos curso3 = new Cursos("Python", 10);
        Cursos curso4 = new Cursos("JavaScript", 15);
        Cursos curso5 = new Cursos("C++", 20);
        Cursos curso6 = new Cursos("C#", 10);

        list.add(curso1);
        list.add(curso2);
        list.add(curso3);
        list.add(curso4);
        list.add(curso5);
        list.add(curso6);
        //Cursos c1 = new Cursos("Matematica", 30, new ArrayList<Clases>());
        // c1.addClase(new Clases("Ecuaciones"));
        // c1.addClase(new Clases("Funciones"));
        // c1.addClase(new Clases("Factoriales"));
        // c1.addClase(new Clases("Fibonacci"));
        // c1.addClase(new Clases("Pascal"));
        // c1.addClase(new Clases("Euler"));
        // c1.addClase(new Clases("Riemann"));
        // c1.addClase(new Clases("Cosenos"));
        // c1.addClase(new Clases("Newton"));
        // c1.addClase(new Clases("Biseccion"));
        // c1.addClase(new Clases("Secante"));
        // list.add(c1);

        //List<Clases> claseLista = c1.getClasesList();
        //claseLista.add(new Clases("Ecuaciones"));
        //c1.addClase(new Clases("Inmutable"));
        //c1.addClase(new Clases("Inmutablemente"));
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).sum());
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).average().getAsDouble());
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).min().getAsInt());
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).max().getAsInt());
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).count());
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).filter(n -> n > 10).count());
        System.out.println();
        System.out.println(list.stream().mapToInt(Cursos::getTiempo).filter(n -> n > 10).average().getAsDouble());
        System.out.println();
        System.out.println(list.stream().filter(n -> !n.getCurso().equalsIgnoreCase("Java")).mapToInt(Cursos::getTiempo).sum());
        //System.out.println(list.get(0).getClasesList());
        System.out.println();
        // Cursos c2 = new Cursos("Fisica", 30);
        // Cursos c3 = new Cursos("Quimica", 30);
        // Cursos c4 = new Cursos("Biologia", 30);
        // Cursos c5 = new Cursos("Filosofia", 30);
        // Cursos c6 = new Cursos("Ingles", 30);

        // list.add(c1);
        // list.add(c2);
        // list.add(c3);
        // list.add(c4);
        // list.add(c5);
        // list.add(c6);


        // for(Materias materias : Materias.values()) {
        //     list.add(materias.getMateria());
        // }
        //list.add(Materias.BIOLOGIA.toString());
        //System.out.println(Materias.values().length);
        //list.forEach(System.out::println);
        //Collections.sort(list);
        //System.out.println();
        //list.forEach(System.out::println);
        //System.out.println();
        //Collections.sort(list, Collections.reverseOrder());
        //list.forEach(System.out::println);
        //list.sort(Comparator.naturalOrder());
        //list.forEach(System.out::println);
        
      

        //list.forEach( i -> System.out.println(doble(i)));
        //System.out.println(Materias.ESPAÑOL);
    }

    public static int doble(int n) {
        return n * 2;
    }

    

}
