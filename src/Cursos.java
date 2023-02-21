import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cursos {
    private String curso;
    private int tiempo;
    private List<Clases> clasesList = new ArrayList<Clases>();

    public Cursos(String curso, int tiempo) {
        this.curso = curso;
        this.tiempo = tiempo;
    }

    public Cursos(String curso, int tiempo, List<Clases> clasesList) {
        this.curso = curso;
        this.tiempo = tiempo;
        this.clasesList = clasesList;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
    public List<Clases> getClasesList() {
        return Collections.unmodifiableList(clasesList);
    }
    
    public void setClasesList(List<Clases> clasesList) {
        this.clasesList = clasesList;
    }
    
    public void addClase(Clases clase) {
        this.clasesList.add(clase);
    }


    @Override
        public String toString() {
            return this.curso;
        }
    
}
