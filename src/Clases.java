public class Clases {
    private String nombre;

    public Clases(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return nombre;
    }

    public void setCurso(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
